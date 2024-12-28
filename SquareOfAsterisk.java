import java.util.Scanner;

public class SquareOfAsterisk {
    // 4. Write a program that reads the width and generates a corresponding square of *. 
    // For example, if width = 5, output is:
    // *****
    // *****
    // *****
    // *****
    // *****
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the square: ");
        int width = scanner.nextInt();

        for (int i = 0; i < width; i++) { // Outer loop for rows
            for (int j = 0; j < width; j++) { // Inner loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next row
        }
        scanner.close(); 
    } 
}
