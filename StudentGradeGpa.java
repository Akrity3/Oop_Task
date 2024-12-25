import java.util.Scanner;

public class StudentGradeGpa {
    public static void main(String[] args) {
        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        // and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the grade (A, B, C, D, or F): ");
            char grade = scanner.next().charAt(0); // Read a single character input

            double gpa; // variable to store the GPA value

            switch (grade) {
                case 'A':
                case 'a':
                    gpa = 4.0;
                    break;
                case 'B':
                case 'b':
                    gpa = 3.0;
                    break;
                case 'C':
                case 'c':
                    gpa = 2.0;
                case 'D':
                case 'd':
                    gpa = 1.0;
                    break;
                case 'F':
                case 'f':
                    gpa = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade entered.");
                    return; // Exit the program if the grade is invalid
                    
            }
            System.out.println("The GPA for grade " + grade + " is: " + gpa); // Output the GPA corresponding to the entered grade
        }finally{
            scanner.close(); // closing scanner
        }
       
    }
    
}
