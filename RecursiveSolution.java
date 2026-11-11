public class RecursiveSolution {

    // (a) Recursive solution: Sum from 0 to n
    public static int tri(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n + tri(n - 1);
    }

    // (b) Recursive solution: Factorial of n
    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return n * fact(n - 1);
    }
}
