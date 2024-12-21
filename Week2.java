import java.util.Scanner;

public class Week2{};

class VoteEligibility {
    public static void main(String[] args){
        // 1. Write a program to check whether a person can cast a vote or not. 
        // The condition is you must be over 18 years old to vote.

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // nextInt() method of the Scanner class reads an integer and value is stored in age.

        if (age >= 18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not elligible to vote.");
        }
        input.close(); // closing scanner
    }
    
}

// 2. Write a program to calculate SI. 
// Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
class SimpleInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        double principle = input.nextDouble();
        System.out.print("Enter Time: ");
        double time = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();

        double simpleInterest = (principle*time*rate/100);

        System.out.print("The simple interest is: " + simpleInterest);
        
        input.close();
    }
}

// 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
// Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;
class AreaVolume{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Area of a Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double areaOfTriangle = (base * height) / 2;
        System.out.println("The area of the triangle is: " + areaOfTriangle);

        // Volume of a Cube
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        double volumeOfCube = side * side * side;
        System.out.println("The volume of the cube is: " + volumeOfCube);

        // Volume of a Cuboid
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();
        double volumeOfCuboid = length * width * heightCuboid;
        System.out.println("The volume of the cuboid is: " + volumeOfCuboid);

        // Close the scanner
        scanner.close();
    }
}


// 4. Write the ternary operator for question no. 1
class TernaryVoteEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Output for the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Use the ternary operator to check if the user is eligible to vote
        String eligibility = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";

        // Display the result
        System.out.println(eligibility);

        // Close the scanner
        scanner.close();
    }
}

// 5. Write a program to take two integer inputs from the user and print the sum and product of them.
class SumAndProduct{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2; // Calculating sum
        int product = number1 * number2; // Calculating product

        System.out.println("The sum of the two integers is: " + sum);
        System.out.println("The product of the two integers is: " + product);

        scanner.close();
    }
}

// 6. Take two integer inputs from the user. First, calculate the sum of two, 
// then the product of two. Finally, calculate the division of the thus obtained 
// sum and product and print the result.
class SumProductDivision{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2; // calculating Sum
        int product = num1 * num2; // Calculating product

        // Calculate the division of sum and product (sum / product)
        // Check if the product is not zero to avoid division by zero
        if (product != 0) {
            double result = (double) sum / product; 

            System.out.println("The result of dividing the sum by the product is: " + result);
        } else {
            System.out.println("Division by zero is not possible (product is zero).");
        }

        // Close the scanner
        scanner.close();
    }
}


// 7. Take the name, roll number, and field of interest from the user and print in the format below: 
// Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
class StudentDetails{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads the name

        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();  // Reads the roll number

        scanner.nextLine();  // Consume the remaining newline character after the integer input

        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();  // Reads the field of interest

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + fieldOfInterest + ".");

        scanner.close();
    }
}

// 8. Take side of a square from user and print area and perimeter of it. 
// Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
// Take the attributes as user input.
class Square{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating an object scanner

        // 1. Square - Area and Perimeter
        System.out.print("Enter the side of the square: ");
        double sideOfSquare = scanner.nextDouble();

        double areaOfSquare = sideOfSquare * sideOfSquare;
        double perimeterOfSquare = 4 * sideOfSquare;

        System.out.println("Area of the square: " + areaOfSquare); // printing area
        System.out.println("Perimeter of the square: " + perimeterOfSquare); // printing perimeter

        // 2. Simple Interest Calculation
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 3. Area of Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double areaOfTriangle = (base * height) / 2;
        System.out.println("Area of the triangle: " + areaOfTriangle);

        // 4. Volume of Cube
        System.out.print("Enter the side length of the cube: ");
        double sideOfCube = scanner.nextDouble();
        double volumeOfCube = sideOfCube * sideOfCube * sideOfCube;
        System.out.println("Volume of the cube: " + volumeOfCube);

        // 5. Volume of Cuboid
        System.out.print("Enter the length of the cuboid: ");
        double lengthOfCuboid = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double widthOfCuboid = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double heightOfCuboid = scanner.nextDouble();

        double volumeOfCuboid = lengthOfCuboid * widthOfCuboid * heightOfCuboid;
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);

        scanner.close();
    }
}

// 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class areaRectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth; // Calculate the area of the rectangle

        int areaAsInt = (int) area; // Type-cast the area to an integer

        // Print the area as an integer
        System.out.println("The area of the rectangle (type-casted to int) is: " + areaAsInt); 
        
        scanner.close();
    }
}

// 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
// a. If equal to or more than 70 -> First Class
// b. If more than 59 -> Upper Second Class
// c. If more than 49 -> Second class
// d. If more than 39 -> Third class and if below than 40 the result is fail. 
// Hint: Use ternary operator
class StudentResult{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subject1, subject2, subject3, subject4;  // Declare variables for the marks of the four subjects

        // Ask the user to input marks for each subject
        System.out.print("Enter marks for Subject 1: ");
        subject1 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 2: ");
        subject2 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 3: ");
        subject3 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 4: ");
        subject4 = scanner.nextDouble();

        // Calculate the total marks and percentage
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        double maxMarks = 400;  // Assuming each subject is out of 100
        double percentage = (totalMarks / maxMarks) * 100;

        // Display total marks and percentage
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Conditional check for result
        String result;
        if (percentage >= 60) {
            result = "Pass";
        } else if (percentage >= 40) {
            result = "Second Division";
        } else {
            result = "Fail";
        }

        // Display final result
        System.out.println("Final Result: " + result);

        // Close the scanner
        scanner.close();
    }
}