package FullCourse;

import java.util.Arrays;

public class MergeSortedArray {
    private static int[] mergeArrays(int[] myArray, int[]aliceArray) {

        int[] resultArray = new int[myArray.length + aliceArray.length];

        int i = 0, j = 0, k = 0;

        while(i < myArray.length && j <aliceArray.length) {
            if(myArray[i] < aliceArray[j]) {
                resultArray[k] = myArray[i];
                i++;
            } else {
                resultArray[k] = aliceArray[j];
                j++;
            }
            k++;
        }

        while (i < myArray.length) {
            resultArray[k] = myArray[i];
            i++;
            k++;
        }

        while (j < aliceArray.length) {
            resultArray[k] = aliceArray[j];
            j++;
            k++;
        }

        return resultArray;
    }


    public static void main(String[] args) {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] aliceArray = new int[]{1, 5, 8, 12, 14, 19};
        System.out.println(Arrays.toString(mergeArrays(myArray, aliceArray)));
    }
}


// Alternate method
// public static int[] mergeArrays(int[] myArray, int[] alicesArray) {
//
//    // set up our mergedArray
//    int[] mergedArray = new int[myArray.length + alicesArray.length];
//
//    int currentIndexAlices = 0;
//    int currentIndexMine   = 0;
//    int currentIndexMerged = 0;
//
//    while (currentIndexMerged < mergedArray.length) {
//
//        boolean isMyArrayExhausted = currentIndexMine >= myArray.length;
//        boolean isAlicesArrayExhausted = currentIndexAlices >= alicesArray.length;
//
//        // case: next comes from my array
//        // my array must not be exhausted, and EITHER:
//        // 1) Alice's array IS exhausted, or
//        // 2) the current element in my array is less
//        //    than the current element in Alice's array
//        if (!isMyArrayExhausted && (isAlicesArrayExhausted
//                || (myArray[currentIndexMine] < alicesArray[currentIndexAlices]))) {
//
//            mergedArray[currentIndexMerged] = myArray[currentIndexMine];
//            currentIndexMine++;
//
//        // case: next comes from Alice's array
//        } else {
//            mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
//            currentIndexAlices++;
//        }
//
//        currentIndexMerged++;
//    }
//
//    return mergedArray;
//}
