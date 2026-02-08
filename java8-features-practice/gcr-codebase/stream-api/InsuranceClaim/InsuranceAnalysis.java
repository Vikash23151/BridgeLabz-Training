package InsuranceClaim;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("C101", "Health", 5000),
                new Claim("C102", "Vehicle", 12000),
                new Claim("C103", "Health", 8000),
                new Claim("C104", "Travel", 3000),
                new Claim("C105", "Vehicle", 7000),
                new Claim("C106", "Health", 6000),
                new Claim("C107", "Travel", 4000)
        );

        Map<String, Double> avgByType = claims.stream().collect(Collectors.groupingBy(c -> c.claimType, Collectors.averagingDouble(c -> c.amount)));

        System.out.println("Average claim amount by type:");
        avgByType.forEach((type, avg) ->
                System.out.println(type + " : " + avg));
    }
}
