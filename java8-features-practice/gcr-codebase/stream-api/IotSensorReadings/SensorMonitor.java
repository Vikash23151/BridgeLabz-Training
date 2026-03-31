package IotSensorReadings;

import java.util.Arrays;
import java.util.List;

public class SensorMonitor {
    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(22.5, 25.0, 30.2, 18.9, 35.6, 28.4, 40.1);

        double threshold = 30.0;

        System.out.println("Readings above threshold (" + threshold + "):");
        
        readings.stream().filter(value -> value > threshold).forEach(value -> System.out.println(value));
    }
}
