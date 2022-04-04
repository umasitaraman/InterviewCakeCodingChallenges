package FullCourse;

import java.util.Arrays;

public class TopScore {

    public static int[] sortScores(int[] unsortedScores, int highestPossibleScore) {
        int[] scoreCounts = new int[highestPossibleScore + 1];

        for(int score : unsortedScores) {
            scoreCounts[score]++;
        }

        int[] sortedArray = new int[unsortedScores.length];

        int currentIndex = 0;

        for(int i = highestPossibleScore; i >= 0 ; i--) {
            int count = scoreCounts[i];
            for(int j = 0; j < count; j++) {
                sortedArray[currentIndex] = i;
                currentIndex++;
            }
        }
        return sortedArray;
    }


    public static void main(String[] args) {
        int[] unsortedScores = {37, 89, 41, 65, 91, 53};
        final int HIGHEST_POSSIBLE_SCORE = 100;

        System.out.println(Arrays.toString(sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE)));
    }
}
