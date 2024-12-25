import java.util.Scanner;
public class ControlFlowT2 {
    public static void main(String[] args){
        // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.print("It is positive number.");
        }else if(num < 0){
            System.out.print("It is negative number.");
        }else{
            System.out.print("The number is zero.");
        }
        

        scanner.close();

    }
    
}
