// 1. Make a method to check if a number is prime or not.

public class JMPrimeONot {
    public static boolean isPrime(int num) {
        if (num < 2) return false;                 // 0 and 1 are not prime
        if (num == 2) return true;                // 2 is the only even prime number
        if (num % 2 == 0) return false;          // Other even numbers are not prime

        for (int i = 3; i <= Math.sqrt(num); i += 2) {  // Check odd numbers only
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 29;
        System.out.println(number + " is prime? " + isPrime(number));
    }
    
}
