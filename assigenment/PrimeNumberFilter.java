import java.util.ArrayList;

public class PrimeNumberFilter {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
    public static ArrayList<Integer> removeDuplicatePrimes(ArrayList<Integer> list) {
        ArrayList<Integer> uniquePrimes = new ArrayList<>();
        for (int num : list) {
         
            if (isPrime(num) && !uniquePrimes.contains(num)) {
                uniquePrimes.add(num); 
            }
        }
        return uniquePrimes;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3); // Duplicate prime
        numbers.add(4); // Not a prime
        numbers.add(11);
        numbers.add(7); // Duplicate prime
        numbers.add(8); // Not a prime
        System.out.println("Original List: " + numbers);
        ArrayList<Integer> uniquePrimes = removeDuplicatePrimes(numbers);
        System.out.println("Unique Primes List: " + uniquePrimes);
    }
}
