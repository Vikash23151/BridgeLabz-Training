import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class SortErrorLogs
{
	public static void main(String[] args) {
	    //Extract and Sort Error Logs
	   String[][] logs = {
            {"25-08-2026", "14:30", "INFO", "Server started"},
            {"25-08-2026", "12:15", "ERROR", "Database failed"},
            {"24-08-2026", "18:00", "CRITICAL", "Server crashed"},
            {"25-08-2026", "12:15", "ERROR", "Connection failed"},
            {"26-08-2026", "09:00", "WARNING", "High memory usage"}
        };

        String[][] result = extractErrorLogs(logs);

        // Print result
        for (String[] log : result) {
            System.out.println(
                log[0] + " " +
                log[1] + " " +
                log[2] + " " +
                log[3]
            );
        }
	}
	
	private static String[][] extractErrorLogs(String[][] logs){
	    ArrayList<String[]> ans=new ArrayList<>();
	    for(String[] log:logs){
	        if(log[2].equals("ERROR")|| log[2].equals("CRITICAL")){
	            ans.add(log);
	        }
	    }
	    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	    ans.sort((a,b)->{
	        LocalDateTime timeA=LocalDateTime.parse(a[0]+" "+a[1],formatter);
	        LocalDateTime timeB=LocalDateTime.parse(b[0]+" "+b[1],formatter);
	        return timeA.compareTo(timeB);
	    });
	    return ans.toArray(new String[0][]);
	}
	
}