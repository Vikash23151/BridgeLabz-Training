package GymMembership;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GymMain {
    public static void main(String[] args) {

        
        List<Member> members = Arrays.asList(
                new Member("Rahul", LocalDate.now().plusDays(10)),
                new Member("Amit", LocalDate.now().plusDays(40)),
                new Member("Sneha", LocalDate.now().plusDays(5)),
                new Member("Priya", LocalDate.now().plusDays(25)),
                new Member("Vikas", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream().filter(m -> !m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(next30Days)).collect(Collectors.toList());

        System.out.println("Memberships expiring within next 30 days:");
        expiringSoon.forEach(m->System.out.println(m.name));
    }
}
