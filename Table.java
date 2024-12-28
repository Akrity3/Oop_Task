public class Table {
    public static void main(String[] args) {
        // 3. Write a program that generates the following table: 
        // Number    Square
        // 10      100
        // 9       81
        // ..    ….
        // 2    4
        // 1    1
        System.out.println("Number\tSquare");
        System.out.println("----------------");

        for (int number = 10; number >= 1; number--) { // Loop to calculate and display numbers and their squares
            int square = number * number; // Calculate square
            System.out.println(number + "\t" + square); // Display the number and its square
        }

    }
    
}
