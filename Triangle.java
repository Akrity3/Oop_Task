import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
        // *
        // **
        // ***
        // ****
        // *****
        // Use a nested for loop to generate the above pattern.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the triangle: ");
        int width = scanner.nextInt();

        for (int i = 1; i <= width; i++) { // Outer loop for rows // Generateing the triangle
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next row
        }
        scanner.close();
    }
    
}
