import java.util.Scanner;
public class ControlFlowT1 {
    public static void main(String[] args){
    // 1. Write a JAVA program to find the maximum between three numbers.
        //    int num1 = 20;
        //    int num2 = 22;
        //    int num3 = 15;
       Scanner scanner= new Scanner(System.in);

       System.out.print("Enter first number: ");
       int num1 = scanner.nextInt();

       System.out.print("Enter second number: ");
       int num2 = scanner.nextInt();

       System.out.print("Enter third number: ");
       int num3 = scanner.nextInt();

       int max;

       if(num1 >= num2 && num1 >= num3){
        max = num1;
       }else if(num2 >= num1 && num2 >= num3){
        max = num2;
       }else{
        max = num3;
       }

       System.out.print("The maximum number between three numbers is: "+max);
       
       scanner.close();

    }
    
}
