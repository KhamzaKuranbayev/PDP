package pdp_lessons.module2.lesson7.task6;

public class Professor extends Person {

    Dollars salary;

    public Professor(Dollars salary) {
        this.salary = salary;
    }

    public Dollars getSalary() {
        return salary;
    }

    public void setSalary(Dollars salary) {
        this.salary = salary;
    }
}
