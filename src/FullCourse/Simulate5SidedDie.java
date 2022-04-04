package FullCourse;

// You have a method rand7() that generates a random integer from 1 to 7.
// Use it to write a method rand5() that generates a random integer from 1 to 5.

import java.util.Random;

public class Simulate5SidedDie {
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

    //  public static int rand5() {
    //      int result = rand7();
    //      return (result <= 5) ? result : rand5();
    //  }
    public static void main(String[] args) {
        System.out.println(rand5());
    }
}

//  Every number can be expressed as a product of prime numbers. This is called its prime factorization.
//
//  For example:
//
//  8 = 2 * 2 * 28=2∗2∗2
//  15 = 5 * 315=5∗3
//  864 = 2 * 2 * 2 * 2 * 2 * 3 * 3 * 3864=2∗2∗2∗2∗2∗3∗3∗3
//  13 = 1313=13
//  Every positive integer has only one prime factorization. This is called the "fundamental theorem of arithmetic."
