package FullCourse;

// Complexity
// O(n) time and O(1) space.

public class FibonacciNumberBottomUp {
    public int fibocciNumber (int n) {
        if(n < 0) {
            throw new IllegalArgumentException("N cannot be a negative number");
        }

        if(n == 0 || n == 1) {
            return n;
        }

        int prevPrev = 0;  // 0th fibonacci
        int prev = 1;      // 1st fibonacci
        int current = 0;   // Declare and initialize current

        for (int i = 1; i < n; i++) {
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }
        return current;
    }

    public static void main(String[] args) {
        FibonacciNumberBottomUp fi = new FibonacciNumberBottomUp();
        System.out.println(fi.fibocciNumber(10));
    }
}
