package javarush.java_core_2.level7.lecture10.task10;
/*
package com.javarush.task.task17.task1710;
*/
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
CRUD
*/
/*
CrUD - Create, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -і:
Миронов м 15-Apr-1990


Требования:
    •
    Класс Solution должен содержать public static поле allPeople типа List<Person>.
    •
    Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
    •
    При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
    •
    При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
    •
    При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.
    •
    При запуске программы с параметром -i программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
    */

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        //start here - начни тут
        String name;
        Sex sex;
        Date bd;
        Person p;
        int id;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");//задаю формат даты


        if (args[0].equals("-c")) { // добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран -c name sex bd

            bd = formatter.parse(args[3]);//создаю дату через

            if (args[2].equals("м")) {
                p = Person.createMale(args[1], bd);
                if (allPeople.add(p)) {
                    System.out.println(allPeople.indexOf(p));
                }
            }
            else if (args[2].equals("ж")) {
                p = Person.createFemale(args[1], bd);
                if (allPeople.add(p)) {
                    System.out.println(allPeople.indexOf(p));
                }
            }


        }
        else if (args[0].equals("-u")) { // обновляет данные человека с данным -u id name sex bd

            bd = formatter.parse(args[4]);//создаю дату через
            p = allPeople.get(Integer.parseInt(args[1]));
            p.setName(args[2]);
            p.setBirthDate(bd);

            if (args[3].equals("м")) {

                p.setSex(Sex.MALE);
                int start = allPeople.size();
                allPeople.set(Integer.parseInt(args[1]), p);
                int finish = allPeople.size();

                if (start-finish != 0) {
                    System.out.println("Ошибка");
                }
            }
            else if (args[3].equals("ж")) {

                p.setSex(Sex.FEMALE);
                allPeople.set(Integer.parseInt(args[1]), p);
                System.out.println(allPeople.size()-1);
            }

        }
        else if (args[0].equals("-d")) { // производит логическое удаление человека с id, заменяет все его данные на null

            p = allPeople.get(Integer.parseInt(args[1]));
            p.setBirthDate(null);
            p.setName(null);
            p.setSex(null);

        }
        else if (args[0].equals("-i")) { //выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
            formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.UK);//задаю формат даты
            p= allPeople.get(Integer.parseInt(args[1]));
            String sx = (p.getSex() == Sex.MALE) ? "м" : "ж";

            System.out.println(p.getName()+" "+ sx +" "+ formatter.format(p.getBirthDate()));
        }
    }
}

