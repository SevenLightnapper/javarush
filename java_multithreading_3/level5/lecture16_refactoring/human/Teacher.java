package javarush.java_multithreading_3.level5.lecture16_refactoring.human;


public class Teacher extends UniversityPerson {
    private int numberOfStudents;

    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }

    public void live() {
        teach();
    }

    public void teach() {
    }

    @Override
    public String getPosition() {
        return "Преподаватель";
    }
}
