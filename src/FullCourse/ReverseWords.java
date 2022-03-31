package FullCourse;

import java.util.Arrays;

public class ReverseWords {

    private static String reverseWords (String str) {
        char[] strArray = str.toCharArray();

        /**
         * To get around this "scooting over" issue, we reversed all the characters in the message first.
         * This put all the words in the correct spots, but with the characters in each word backward.
         * So to get the final answer, we reversed the characters in each word.
         * This all takes two passes through the message, so O(n)O(n) time total.
         */

        reverseString(strArray, 0, strArray.length - 1);

        int startIndex = 0;

        for (int i = 0; i <= strArray.length; i++) {
            if(i == strArray.length || strArray[i] == ' ') {
                reverseString(strArray, startIndex, i - 1);
                startIndex = i + 1;
            }
        }

        return Arrays.toString(strArray);
    }

    private static void reverseString (char[] str, int leftIndex, int rightIndex) {
        while(leftIndex < rightIndex) {
            char temp = str[leftIndex];
            str[leftIndex] = str[rightIndex];
            str[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String str = "The eagle's wings";
        System.out.println(rw.reverseWords(str));
    }
}


