public class TableDisplay {
    public static void main(String[] args) {
        // 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
        // Miles    Kilometers
        // 1    1.609
        // 2    3.218
        // …    ….
        // 9    14.481
        // 10    16.090
       
        System.out.println("Miles\tKilometers");
        System.out.println("------------------");

        // Loop to calculate and display miles and kilometers
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609; // Convert miles to kilometers
            System.out.println(miles + "\t" + String.format("%.3f", kilometers)); // Format and print
        }
    }

}
    

