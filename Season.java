import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints 
        // the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the month as integer (1 to 12): ");
            int month = scanner.nextInt();

            String season; // Variable to store crossponding season

            switch (month) {
                case 1: case 2: case 3:
                    season = "Winter";
                    break;
                case 4: case 5: case 6:
                    season = "Spring";
                case 7: case 8: case 9:
                    season ="Summer";
                    break;
                case 10: case 12:
                    season="Fall";
                    break;
            
                default:
                    System.out.println("Invalid month entered.");
                    return; // Exit the program if the month is not between 1 and 12
                  
            }
             // Output 
             System.out.println("The season for month " + month + " is: " + season);


        } finally{
            scanner.close();
        }
        
    }
    
}
