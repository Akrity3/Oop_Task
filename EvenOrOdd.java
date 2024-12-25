import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        // 4. Write a JAVA program to check whether a number is even or odd.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.print(num + " is an even number.");
        } else {
            System.out.print(num + " is an odd number.");
        }

        scanner.close();

    }
    
}
