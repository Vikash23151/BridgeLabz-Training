package EventAttendeeWelcome;

import java.util.Arrays;
import java.util.List;

public class EventWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Rahul","Sneha","Amit","Priya","Vikas");

        System.out.println("Welcome Messages:");

        attendees.forEach(name -> {
            System.out.println("Welcome " + name + "! We are glad to have you at the event.");
        });
    }
}
