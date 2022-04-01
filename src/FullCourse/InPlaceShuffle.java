package FullCourse;
import java.util.Arrays;
import java.util.Random;

public class InPlaceShuffle {

    private static Random rand = new Random();

    private static int getRandom(int floor, int ceiling) {
        return rand.nextInt((ceiling - floor) + 1) + floor;

    }

    public static int[] shuffle(int[] array) {

        // if it's 1 or 0 items, just return
        if (array.length <= 1) {
            return array;
        }

        for(int i = 0; i < array.length; i++) {
            int randomIndex = getRandom(i, array.length - 1);
            System.out.println("randomIndex : " + randomIndex);
            if(randomIndex != i) {
                int valueAtIndex = array[i];
                array[i] = array[randomIndex];
                array[randomIndex] = valueAtIndex;
            }
        }
        return array;
    }


        public static void main(String[] args) {
        InPlaceShuffle ips = new InPlaceShuffle();
        int[] arr = {5,2,7,1,9,10};
        System.out.println(Arrays.toString(shuffle(arr)));
    }

}
