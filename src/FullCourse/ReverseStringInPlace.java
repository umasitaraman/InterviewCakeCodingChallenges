package FullCourse;

import java.util.Arrays;

public class ReverseStringInPlace {
    public String reversedString (String str) {
        char[] strArray = str.toCharArray();
        int len = strArray.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = strArray[len - 1 - i];
            strArray[len - 1 - i] = strArray[i];
            strArray[i] = temp;
        }
        return Arrays.toString(strArray);
    }

    public static void main(String[] args) {
        ReverseStringInPlace rsip = new ReverseStringInPlace();
        String str = "BoCat";
        //taCboB
        System.out.println(rsip.reversedString(str));

    }
}



// Alternate solution
// public static void reverse(char[] arrayOfChars) {
//
//    int leftIndex = 0;
//    int rightIndex = arrayOfChars.length - 1;
//
//    while (leftIndex < rightIndex) {
//
//        // swap characters
//        char temp = arrayOfChars[leftIndex];
//        arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
//        arrayOfChars[rightIndex] = temp;
//
//        // move towards middle
//        leftIndex++;
//        rightIndex--;
//    }
//}