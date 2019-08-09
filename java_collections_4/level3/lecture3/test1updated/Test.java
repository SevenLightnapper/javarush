package javarush.java_collections_4.level3.lecture3.test1updated;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
/*
Результат сериализации и вывода на экран:

{"age":5, "alias":"Murka"}
 */
public class Test {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        StringWriter writer = new StringWriter();

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(writer, cat);

        String result = writer.toString();
        System.out.println(result);
    }
}
