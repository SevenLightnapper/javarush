package javarush.java_core_2.level3.lecture11.task12;

public class Person implements RepkaStory.RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(this.getName() + " за " + person.getNamePadezh());
    }
}

