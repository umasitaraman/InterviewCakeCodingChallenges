package FullCourse;

public class ProductOfThreeNumbers {

    public static int highestProductOf3(int[] intArray) {
        int maxValue1 = intArray[0];
        int maxValue2 = intArray[1];
        int negativeNumber = Math.min(maxValue1, maxValue2);
        int maxProduct = maxValue1 * maxValue2 * intArray[3];

        for (int i = 2; i < intArray.length; i++) {

            if(intArray[i] < 0) {
                maxProduct = (negativeNumber*intArray[i]*Math.max(maxValue1, maxValue2));
                negativeNumber = Math.min(negativeNumber, intArray[i]);
            }

            maxProduct = Math.max(maxProduct, maxValue1 * maxValue2 * intArray[i]);
            if (maxValue1 <= maxValue2 && maxValue1 < intArray[i]) {
                maxValue1 = intArray[i];
            } else if (maxValue2 < intArray[i]) {
                maxValue2 = intArray[i];
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {

    }

}
