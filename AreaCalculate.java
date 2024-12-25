import java.util.Scanner;

public class AreaCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            double area; // variable to store the area

            // Perform the corresponding area calculation based on the user's choice
            switch (choice) {
                case 1:
                    // Calculate the area of a circle (Area = π * r^2)
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    area = Math.PI * radius * radius;
                    System.out.println("The area of the circle is: " + area);
                    break;
                case 2:
                    // Calculate the area of a rectangle (Area = length * width)
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    area = length * width;
                    System.out.println("The area of the rectangle is: " + area);
                    break;
                case 3:
                    // Calculate the area of a square (Area = side^2)
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    area = side * side;
                    System.out.println("The area of the square is: " + area);
                    break;
                case 4:
                    // Calculate the area of a triangle (Area = 0.5 * base * height)
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("The area of the triangle is: " + area);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } finally {
            // Close the scanner to release the resource
            scanner.close();
        }
    }
    
}
