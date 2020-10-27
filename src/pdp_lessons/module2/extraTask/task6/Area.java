package pdp_lessons.module2.extraTask.task6;

public class Area {

    String areaName;
    double areaSize;
    long areaPopulation;

    public Area(String areaName, double areaSize, long areaPopulation) {
        this.areaName = areaName;
        this.areaSize = areaSize;
        this.areaPopulation = areaPopulation;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public long getAreaPopulation() {
        return areaPopulation;
    }

    public void setAreaPopulation(long areaPopulation) {
        this.areaPopulation = areaPopulation;
    }

    public void printInfo(String areaName, double areaSize, long areaPopulation) {
        System.out.println("Area: " + areaName + " | Area size: " + areaSize + " | Area Population: " + areaPopulation);
    }

}
