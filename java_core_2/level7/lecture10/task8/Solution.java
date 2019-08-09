package javarush.java_core_2.level7.lecture10.task8;
/*
package com.javarush.task.task17.task1721;
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/
/*
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.

Требования:
    •
    Класс Solution должен содержать public static поле allLines типа List<String>.
    •
    Класс Solution должен содержать public static поле forRemoveLines типа List<String>.
    •
    Класс Solution должен содержать public void метод joinData() который может бросать исключение CorruptedDataException.
    •
    Программа должна считывать c консоли имена двух файлов.
    •
    Программа должна считывать построчно данные из первого файла в список allLines.
    •
    Программа должна считывать построчно данные из второго файла в список forRemoveLines.
    •
    Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
    •
    Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.
    •
    Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader readerFrom = new BufferedReader(new InputStreamReader(System.in));

        // read the path of the first file
        String firstFileName = readerFrom.readLine();
        // read the path of the second file
        String secondFileName = readerFrom.readLine();
        // close the flow of  readerFrom
        readerFrom.close();

        File firstFile = new File(firstFileName);
        File secondFile = new File(secondFileName);
        //создаем объект FileReader для объекта firstFile и secondFile
        // create an  FileReader  object  fr1  for the  File  object  firstFile
        FileReader fr1 = new FileReader(firstFile);
        // create an  FileReader  object  fr2  for the  File  object  secondFile
        FileReader fr2 = new FileReader(secondFile);

        // create  BufferedReader firstReaderTo  from existing  FileReader fr1  for line-by-line reading
        BufferedReader firstReaderTo = new BufferedReader(fr1);
        // create  BufferedReader secondReaderTo  from existing  FileReader fr2  for line-by-line reading
        BufferedReader secondReaderTo = new BufferedReader(fr2);


        // read the first line from the first file
        String line1 = firstReaderTo.readLine();
        // read the first line from the second file
        String line2 = secondReaderTo.readLine();

        // loop for the first file
        while (line1 != null) {
            allLines.add(line1);

            line1 = firstReaderTo.readLine();
        }

        // loop for the second file
        while (line2 != null) {
            forRemoveLines.add(line2);

            line2 = secondReaderTo.readLine();
        }

        // close the flows of fr1 and fr2
        fr1.close();
        fr2.close();

        Solution s = new Solution();
        try {
            s.joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Битые данные!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

