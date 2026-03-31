package TransformingNames;

import java.util.Arrays;
import java.util.List;

public class CustomerDisplay {
    public static void main(String[] args) {

        List<String> customers = Arrays.asList("rahul","Amit","sneha","vikas","anita","Rohit");

        System.out.println("Customer Names (Formatted):");

        customers.stream().map(name -> name.toUpperCase()).sorted().forEach(System.out::println);
    }
}