package HospitalDoctorAvailability;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalMain {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Shaurya", "Cardiology", true),
                new Doctor("Dr. Vikash", "Neurology", false),
                new Doctor("Dr. Dheeraj", "Orthopedic", true),
                new Doctor("Dr. Harshit", "Dermatology", true),
                new Doctor("Dr. Rajat", "Pediatrics", false),
                new Doctor("Dr. Nikhil", "Cardiology", true)
        );

        List<Doctor> weekendDoctors = doctors.stream().filter(d -> d.weekendAvailable).sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty)).collect(Collectors.toList());

        System.out.println("Doctors available on weekends:");
        weekendDoctors.forEach(d->System.out.println(d.name));
    }
}
