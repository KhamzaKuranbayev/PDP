package pdp_lessons.module3.lesson3.task10;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        printTimeAllTimeZones();
    }

    public static void printTimeAllTimeZones() {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        allZones.forEach(s -> {
            System.out.println(s + ": " + LocalTime.now(ZoneId.of(s)));
        });

    }

}
