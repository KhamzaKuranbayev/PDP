package pdp_lessons.module3.lesson3.task11;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TrafficDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        long count = 0;
        while (count <= 10) {

            // RED
            {
                System.out.println(TrafficLight.RED.getAction());
                waiting(30);
            }

            // YELLOW
            {
                System.out.println(TrafficLight.YELLOW.getAction());
                waiting(10);
            }

            // GREEN
            {
                System.out.println(TrafficLight.GREEN.getAction() + "\n");
                waiting(20);
            }

            count = ChronoUnit.MINUTES.between(LocalTime.now(), localTime);
        }
    }

    public static void waiting(int time) {
        LocalTime start = LocalTime.now();
        long second_count = 0;
        while (second_count <= time) {
            second_count = Duration.between(start, LocalTime.now()).getSeconds();
        }
    }
}
