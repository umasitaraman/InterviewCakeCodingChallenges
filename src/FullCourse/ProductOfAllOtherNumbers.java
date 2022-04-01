package FullCourse;

import java.util.Arrays;

public class ProductOfAllOtherNumbers {
    public int[] highestProduct(int [] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
        }

        int[] productOfAllNumbersExcept = new int[arr.length];
        int productBeforeIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            productOfAllNumbersExcept[i] = productBeforeIndex;
            productBeforeIndex *= arr[i];
        }
        System.out.println(Arrays.toString(productOfAllNumbersExcept));
        int productAfter = 1;
        for(int i = (arr.length - 1); i >= 0; i--) {
            productOfAllNumbersExcept[i] *= productAfter;
            productAfter *= arr[i];
        }
        return productOfAllNumbersExcept;
    }
//    //Alternate method If we could use division
//    public int[] highestProduct(int [] arr) {
//        if (arr.length < 2) {
//            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
//        }
//        int productOfAllNumbers = 1;
//        int zeroProduct = 1;
//        int[] productOfAllNumbersExcept = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                zeroProduct *= arr[i];
//            }
//            productOfAllNumbers *= arr[i];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != 0) {
//                productOfAllNumbersExcept[i] = productOfAllNumbers / arr[i];
//            } else {
//                productOfAllNumbersExcept[i] = zeroProduct;
//            }
//        }
//        return productOfAllNumbersExcept;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 9};
        ProductOfAllOtherNumbers hp3 = new ProductOfAllOtherNumbers();
        System.out.println(Arrays.toString(hp3.highestProduct(arr)));
    }
}
