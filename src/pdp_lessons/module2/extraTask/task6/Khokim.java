package pdp_lessons.module2.extraTask.task6;

public class Khokim extends Person {

    int yearsActive;

    public Khokim(String firstname, String lastname, String address, int yearsActive) {
        super(firstname, lastname, address);
        this.yearsActive = yearsActive;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void printJob(String job) {
        System.out.print(job + ": ");
    }

    @Override
    public String toString() {
        return "Years active: " + yearsActive;
    }
}
