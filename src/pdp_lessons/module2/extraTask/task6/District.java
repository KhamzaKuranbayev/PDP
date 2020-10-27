package pdp_lessons.module2.extraTask.task6;

public class District extends Area {

    Khokim khokim;

    public District(String areaName, double areaSize, long areaPopulation, Khokim khokim) {
        super(areaName, areaSize, areaPopulation);
        this.khokim = khokim;
    }

    public Khokim getKhokim() {
        return khokim;
    }

    public void setKhokim(Khokim khokim) {
        this.khokim = khokim;
    }
}
