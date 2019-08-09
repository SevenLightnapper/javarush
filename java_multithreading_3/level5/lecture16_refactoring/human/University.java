package javarush.java_multithreading_3.level5.lecture16_refactoring.human;

import java.util.*;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student student = null;
        for (Student s : students) {
            if (s.getAverageGrade()==averageGrade){
                student =s;
            }
        }
        return student;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student student = null;
        double maxAvaregeGrade=0;
        for (Student s : students) {
            if (s.getAverageGrade() > maxAvaregeGrade){
                maxAvaregeGrade = s.getAverageGrade();
                student = s;
            }
        }
        return student;
    }

    public Student getStudentWithMinAverageGrade() {
        Student student = null;
        double minAverageGrade=100;
        for (Student s : students) {
            if(s.getAverageGrade() < minAverageGrade){
                minAverageGrade = s.getAverageGrade();
                student = s;
            }
        }
        return student;
    }
    public void expel(Student student){
        students.remove(student);
    }
}
