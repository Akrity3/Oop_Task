import java.util.Scanner;

public class TwoIntCalculator {
    public static void main(String[] args) {
        // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) 
        // as inputs and performs the corresponding arithmetic operation using a switch case statement.
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            double result; // variable to store the result

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.print("Invalid operator entered!");
                    return;  // exit program if operator is invalid

            }
            System.out.print("The result of " + num1 + " " + operator + " " + num2 + " is: " + result);


        } finally{
            scanner.close();
        }
        
    } 
    
}
