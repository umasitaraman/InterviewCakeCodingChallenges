package FullCourse;


//      n is 8
//      1, 2, 3, 4, 5, 6, 7, 8
//            1 + 8 = 9
//            2 + 7 = 9
//            3 + 6 = 9
//            4 + 5 = 9
// This is true for every triangular series:
//Pairs of numbers on each side will always add up to the same value.
//That value will always be 1 more than the series’ n.
//This gives us a pattern. Each pair's sum is n+1, and there are n / 2 pairs. So our total sum is:
//        (n + 1) * (n / 2)
//        ((n * n) + n) / 2


public class WhichAppearsTwice_TriangularSeries {
    public static int repeatedNumber (int [] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Finding duplicate requires at least two numbers");
        }

        int n = numbers.length - 1;
        int triangularSum = ((n * n) + n) / 2;
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum - triangularSum;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(repeatedNumber(nums));
    }
}
