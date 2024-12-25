import java.util.Scanner;
public class ControlFlowT3 {
    public static void main(String[] args){
        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if ( num % 5 == 0 && num % 11 == 0){
            System.out.print(num + " is divisible by 5 and 11.");
        }else{
            System.out.print(num + " is not divisible by 5 and 11.");
        }

        scanner.close();
    }
    
}
