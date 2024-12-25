import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: "); // Taking letter from user
        char  letter = scanner.next().charAt(0);

        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')){
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || // Check if it is a vowel
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println(letter + " is a vowel.");
        }else {
            System.out.println(letter + " is a consonant.");
        }
    } else {
        System.out.println("Invalid input! Please enter an alphabet.");
    }

    scanner.close(); // Closing the scanner

    }
    
}
