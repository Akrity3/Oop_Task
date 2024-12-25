import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        // 5. Write a JAVA program to check whether a year is a leap year or not. 
        // Hint: if year%4==0; if year%100!==0 ; year%400==0; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear; // checking if the year is leap year 
        if (year % 4 == 0){
            if (year % 100 != 0 || year % 400 == 0 ){
                isLeapYear = true;
            }else{
                isLeapYear = false;
            }

        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {   // output the result
            System.out.println(year+" is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();


    }
    
}
