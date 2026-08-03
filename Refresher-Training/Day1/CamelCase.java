import java.util.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = camelcase(s);
        System.out.println(result);
        sc.close();
    }

    public static int camelcase(String s) {
        int count = 1;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                count++;
        }
        return count;
    }
}