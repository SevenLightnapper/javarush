package javarush.java_collections_4.level2.lecture6.task2;
/*
package com.javarush.task.task32.task3211;
*/
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/*
Целостность информации
*/
/*
Представь ситуацию, ты выкачал архив с интернета, и в момент скачивания у тебя на несколько секунд пропало соединение.
Нужно убедиться, валидный ли архив ты скачал. Для этого сверим его MD5 хеш.
Прочитать о MD5 на wiki.
Прочитать о MessageDigest.

Реализуй логику метода compareMD5,
который должен получать MD5 хеш из переданного ByteArrayOutputStream
и сравнивать с эталонным MD5 переданным вторым параметром.
Метод main не участвует в тестировании.
Требования:

    •
    Класс Solution должен содержать метод compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5).
    •
    Метод compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) должен использовать MessageDigest.
    •
    Метод compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) должен
    возвращать результат сравнения вычисленного MD5 хеша для byteArrayOutputStream с переданным параметром md5.
    •
    Класс Solution должен содержать метод main.
    */

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(byteArrayOutputStream.toByteArray());

        //Конвертация в строку посчитанного md5 значения из ByteArrayOutputStream
        byte[] digest = messageDigest.digest();
        BigInteger tmp = new BigInteger(1, digest);
        String md5Hash = tmp.toString(16);
        while (md5Hash.length() < 32) //Добивка 0 до длинны в 16 байт
            md5Hash = "0" + md5Hash;

        return md5Hash.equals(md5);
    }
}

