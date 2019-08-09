package javarush.java_collections_4.level3.lecture3.test2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
class Cat
{
    public String name;
    public int age;
    public int weight;

    Cat() { }
}
