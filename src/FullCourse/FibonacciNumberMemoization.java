package FullCourse;

import java.util.HashMap;
import java.util.Map;
// For recursion, the time complexity would be O(2^n) since every node will split into two subbranches.
// And the space complexity would be O(N) since the depth of the tree will be proportional to the size of n.

// Complexity of Memoization
// O(n) time O(n) space

public class FibonacciNumberMemoization {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int fibocciNumber (int n) {
        if(n < 0) {
            throw new IllegalArgumentException("N cannot be a negative number");
        }

        if(n == 0 || n == 1) {
            return n;
        }

        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibocciNumber(n - 1) + fibocciNumber(n - 2);

        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        FibonacciNumberMemoization fi = new FibonacciNumberMemoization();
        System.out.println(fi.fibocciNumber(10));
    }
}
