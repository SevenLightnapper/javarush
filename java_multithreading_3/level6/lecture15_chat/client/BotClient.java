package javarush.java_multithreading_3.level6.lecture15_chat.client;

import javarush.java_multithreading_3.level6.lecture15_chat.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BotClient extends Client {
    @Override
    protected BotSocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected String getUserName() {
        return String.format("date_bot_%d", (int) (Math.random() * 90));
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {
                String[] strings = message.split(": ");
                String userName = strings[0];
                String text = strings[1];
                SimpleDateFormat simpleDateFormat;
                switch (text) {
                    case "дата":
                        simpleDateFormat = new SimpleDateFormat("d.MM.YYYY");
                        break;
                    case "день":
                        simpleDateFormat = new SimpleDateFormat("d");
                        break;
                    case "месяц":
                        simpleDateFormat = new SimpleDateFormat("MMMM");
                        break;
                    case "год":
                        simpleDateFormat = new SimpleDateFormat("YYYY");
                        break;
                    case "время":
                        simpleDateFormat = new SimpleDateFormat("H:mm:ss");
                        break;
                    case "час":
                        simpleDateFormat = new SimpleDateFormat("H");
                        break;
                    case "минуты":
                        simpleDateFormat = new SimpleDateFormat("m");
                        break;
                    case "секунды":
                        simpleDateFormat = new SimpleDateFormat("s");
                        break;
                    default:
                        simpleDateFormat = null;
                        break;
                }

                if (simpleDateFormat != null) {
                    Calendar calendar = Calendar.getInstance();
                    String result = "Информация для " + userName + ": ";
                    result += simpleDateFormat.format(calendar.getTime());
                    sendTextMessage(result);
                }
            } else
                return;
        }

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. " +
                    "Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }
    }
}
