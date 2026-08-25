import java.io.*;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
    String[] nums={
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", 
        "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", 
        "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", 
        "twenty eight", "twenty nine"
    };
    
    // current hour and the next hour (handling the 12 to 1 wrap-around)
    String currentHour = nums[h];
    String nextHour = nums[(h % 12) + 1];

    if (m == 0) {
        return currentHour + " o' clock";
    } else if (m == 1) {
        return "one minute past " + currentHour;
    } else if (m == 15) {
        return "quarter past " + currentHour;
    } else if (m == 30) {
        return "half past " + currentHour;
    } else if (m == 45) {
        return "quarter to " + nextHour;
    } else if (m == 59) {
        return "one minute to " + nextHour;
    } else if (m < 30) {
        return nums[m] + " minutes past " + currentHour;
    } else {
        return nums[60 - m] + " minutes to " + nextHour;
    }

    }

}

public class TimeInWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
