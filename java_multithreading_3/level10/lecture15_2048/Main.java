package javarush.java_multithreading_3.level10.lecture15_2048;


import javax.swing.*;

/**
 *
 * будет содержать только метод main и служить точкой входа в наше приложение.
 */

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        JFrame game = new JFrame();

        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        game.add(controller.getView());


        game.setLocationRelativeTo(null);
        game.setVisible(true);

    }
}
// https://github.com/vladmeh/jrt/blob/master/3.JavaMultithreading/src/com/javarush/task/task35/task3513/Controller.java