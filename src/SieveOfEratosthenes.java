/*
Q227 — Generate Valid Session Seeds

A system needs all prime numbers up to 100 to use as valid session token seeds.
Generate and print them all using the **Sieve of Eratosthenes** algorithm.

Expected Output:
Primes up to 100: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
Total count: 25

Constraint: Use an array of booleans, not a loop checking each number individually.
*/

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        // 1. Size 101 to include index 100
        boolean[] isPrime = new boolean[101];

        // 2. Mark numbers 2 to 100 as true (assume prime initially)
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // 3. Run the Sieve algorithm
        check(isPrime);

        // 4. Print results matching the expected format
        System.out.print("Primes up to 100: ");
        int counter = 0;

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                counter++;
            }
        }

        System.out.println();
        System.out.println("Total count: " + counter);
    }

    private static void check(boolean[] isPrime) {
        // Outer loop picks prime candidates up to sqrt(length)
        for (int i = 2; i * i < isPrime.length; i++) {

            // If i is still prime, cross out its multiples
            if (isPrime[i]) {
                // Inner loop steps by 'i' to hit multiples (i*i, i*i + i, i*i + 2i...)
                for (int multiple = i * i; multiple < isPrime.length; multiple += i) {
                    isPrime[multiple] = false;
                }
            }

        }
    }
}