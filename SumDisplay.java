import java.util.Scanner;

public class SumDisplay {
    public static void main(String[] args) {
        // 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
        // Sample Run:
        // Enter a positive non-zero integer 4
        // Sum of 1 to 4 is 10
        // Do you want to continue? Enter ‘y’ for yes or any other character for no.
        // Enter a positive non-zero integer 3
        // Sum of 1 to 3 is 6
        // Do you want to continue? Enter ‘y’ for yes and any other character for no.
        
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Prompt user for input
            System.out.print("Enter a positive non-zero integer: ");
            int number = scanner.nextInt();

            // Calculate the sum of numbers from 1 to the entered number
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum of 1 to " + number + " is " + sum);
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: "); //Asking if the user wants to continue
            choice = scanner.next().charAt(0); // Read the user's choice

        } while (choice == 'y' || choice == 'Y'); // Continue if the user enters 'y' or 'Y'

        scanner.close();
        System.out.println("Program ended.");
    }
    
}
