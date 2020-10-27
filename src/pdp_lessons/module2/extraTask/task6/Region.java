package pdp_lessons.module2.extraTask.task6;

public class Region extends Area {

    Khokim khokim;
    District[] districts;

    public Region(String areaName, double areaSize, long areaPopulation, Khokim khokim, District[] districts) {
        super(areaName, areaSize, areaPopulation);
        this.khokim = khokim;
        this.districts = districts;
    }

    public Khokim getKhokim() {
        return khokim;
    }

    public void setKhokim(Khokim khokim) {
        this.khokim = khokim;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public void printInfo(String areaName, double areaSize, long areaPopulation) {
        super.printInfo(areaName, areaSize, areaPopulation);
        System.out.println("Hokim" + khokim + " | District: " + districts);
    }
}
