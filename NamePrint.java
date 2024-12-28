import java.util.Scanner;
public class NamePrint {
    public static void main(String[] args) {
        // 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        for(int i = 1; i<=5; i++){
            System.out.print(" Hello "+ name);
        }
        scanner.close();
    }
    
}
