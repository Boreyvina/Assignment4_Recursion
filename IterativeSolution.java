public class IterativeSolution {

    // (a) Iterative solution: Sum from 0 to n
    public static int tri(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // (b) Iterative solution: Factorial of n
    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
