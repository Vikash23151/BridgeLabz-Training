package EmailNotifications;

import java.util.*;

public class EmailNotifications {

    public static void sendEmail(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList("rahul@gmail.com","sneha@gmail.com","amit@gmail.com","priya@gmail.com","vikas@gmail.com");

        System.out.println("Sending notifications...");

        emails.forEach(email -> sendEmail(email));
    }
}

