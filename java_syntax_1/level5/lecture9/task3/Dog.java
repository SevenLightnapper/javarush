package javarush.java_syntax_1.level5.lecture9.task3;
/*
    ackage com.javarush.Task.task05.task0518;
*/
    /*
    Регистрируем собачек
    */
/*
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/
    public class Dog {
        String name = null;
    int height;
    String color = null;
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }//напишите тут ваш код
    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

        public static void main(String[] args) {

        }
    }


