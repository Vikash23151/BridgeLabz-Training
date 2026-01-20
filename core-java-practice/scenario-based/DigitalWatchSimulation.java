public class DigitalWatchSimulation {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.printf("%02d:%02d\n", hour, minute);
                // Power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped.");
                    break;
                }
            }
            // Exit outer loop after power cut
            if (hour == 13) {
                break;
            }
        }
    }
}