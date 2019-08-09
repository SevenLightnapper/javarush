package javarush.java_core_2.level10.lecture2.task2;
/*
package com.javarush.task.task20.task2002;
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
*/
/*
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
Метод main реализован только для вас и не участвует в тестировании.
Требования:

    •
    Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
    •
    Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
    •
    Класс Solution.JavaRush не должен поддерживать интерфейс Serializable.
    •
    Класс Solution.JavaRush должен быть публичным.
    •
    Класс Solution.JavaRush не должен поддерживать интерфейс Externalizable.
    */

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            if (!users.isEmpty()){
                for (User user : users) {

                    if (user.getFirstName() != null) writer.println(user.getFirstName());
                    else writer.println("null");

                    if (user.getLastName() != null) writer.println(user.getLastName());
                    else writer.println("null");

                    if (user.getBirthDate() != null) writer.println((Object) user.getBirthDate().getTime());
                    else writer.println((Object) "null");

                    writer.println(user.isMale());

                    if (user.getCountry() != null) writer.println(user.getCountry());
                    else writer.println((Object) "null");
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            while (reader.ready()){
                User user = new User();
                String s = reader.readLine();

                if (s.equals("null")) user.setFirstName(null);
                else user.setFirstName(s);

                s = reader.readLine();
                if (s.equals("null")) user.setLastName(null);
                else user.setLastName(s);

                s = reader.readLine();
                try{
                    user.setBirthDate(new Date(Long.parseLong(s)));
                }catch (Exception e){
                    user.setBirthDate(null);
                }

                user.setMale(reader.readLine().equals("true"));

                s = reader.readLine();
                User.Country countrySet = null;
                if (!s.equals("null")){
                    for (User.Country country :
                            User.Country.values()) {
                        if (s.equalsIgnoreCase(country.getDisplayName())){
                            countrySet = country;
                        }
                    }
                    user.setCountry(countrySet);

                }else user.setCountry(null);
                users.add(user);
            }

            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

