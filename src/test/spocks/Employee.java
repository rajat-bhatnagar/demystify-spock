package spocks;

/**
 * Created by rajatbhatnagar on 1/18/16.
 */
public class Employee {
    private String name;
    private int grade;

    public Employee(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
