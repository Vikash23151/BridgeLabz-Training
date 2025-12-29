import java.util.Scanner;

public class EmployeeWageComputation {
    static Scanner sc=new Scanner(System.in);

    static boolean checkAttendance(){
        int present=(int) (Math.random()*2);
        return present==1;
    }
    static int calculateDailyEmployeeWage(int employeeStatus){
        int wagePerHour=employeeStatus==1?20:15;
        int workingHours=employeeStatus==1?8:6;
        int dailyWage=wagePerHour*workingHours;
        return dailyWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        int totalWorkingHours=0;
        int totalWorkingDays=1;
        int totalWage=0;
        while(totalWorkingDays<=20 && totalWorkingHours<=100) {
            boolean employeeIsPresent = checkAttendance();
            if (employeeIsPresent) {
                System.out.println("Enter if you are full time employee press (1) or part time employee press (2): ");
                int employeeStatus = sc.nextInt();
                switch (employeeStatus) {
                    case 1:
                        totalWorkingHours+=8;
                        int fullTimePerDayWage = calculateDailyEmployeeWage(employeeStatus);
                        totalWage+=fullTimePerDayWage;
                        int fullTimePerMonthWage = fullTimePerDayWage * 20;
                        System.out.println("Wage per day: " + fullTimePerDayWage);
                        System.out.println("Wages per Month: " + fullTimePerMonthWage);
                        break;
                    case 2:
                        totalWorkingHours+=6;
                        int partTimePerDayWage = calculateDailyEmployeeWage(employeeStatus);
                        totalWage+=partTimePerDayWage;
                        int partTimePerMonthWage = partTimePerDayWage * 20;
                        System.out.println("Wage per day: " + partTimePerDayWage);
                        System.out.println("Wages per Month: " + partTimePerMonthWage);
                        break;
                }
                totalWorkingDays++;
            }
        }
        System.out.println("Total wages of both full-time & part-time: "+totalWage);

    }
}
