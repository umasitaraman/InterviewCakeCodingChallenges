package FullCourse;

//  public static int rand7Mod() {
//    return (rand5() + rand5()) % 7 + 1;
//  }
// This solution does not give equal probabilities for all the numbers
// If each of our 7 results of rand7Mod() were equally probable,
// we'd need to have the same number of outcomes for each of the 7 integers in the range 1..7.
// That means our total number of outcomes would have to be divisible by 7,

import java.util.Random;

public class Simulate7SidedDie {
    public static int rand5() {
        int result = 7;
        while (result > 5) {
            result = rand7();
        }
        return result;
    }

    public static int rand7() {
        Random rand = new Random();
        return rand.nextInt(8);
    }

    public static void main(String[] args) {
        System.out.println(rand5());
    }
}
