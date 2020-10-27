package pdp_lessons.module2.extraTask.task6;

import java.util.Arrays;

public class Republic extends Area {

    President president;
    Region[] regions;

    public Republic(String areaName, double areaSize, long areaPopulation, President president, Region[] regions) {
        super(areaName, areaSize, areaPopulation);
        this.president = president;
        this.regions = regions;
    }

    public President getPresident() {
        return president;
    }

    public Region[] getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        return "Republic{" +
                "regions=" + Arrays.toString(regions) +
                '}';
    }
}
