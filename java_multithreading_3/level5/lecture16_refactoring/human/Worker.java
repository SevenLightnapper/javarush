package javarush.java_multithreading_3.level5.lecture16_refactoring.human;

public class Worker extends Human {
    private double salary;
    private String company;
    private String name;
    private int age;

    public Worker(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void live() {
        super.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
