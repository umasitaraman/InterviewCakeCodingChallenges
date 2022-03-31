package FullCourse;

public class CafeOrderChecker {
    public static boolean isFirstComeFirstServed (int[] dineInOrders, int[] takeOutOrders, int[] servedOrders) {
        int takeOutIndex = 0;
        int dineInIndex = 0;

        for (int order : servedOrders) {
            if(takeOutIndex < takeOutOrders.length && order == takeOutOrders[takeOutIndex]) {
                takeOutIndex++;
            } else if (dineInIndex < dineInOrders.length && order == dineInOrders[dineInIndex]) {
                dineInIndex++;
            } else {
                return false;
            }
        }
        if(takeOutIndex != takeOutOrders.length || dineInIndex != dineInOrders.length) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] takeOutOrders = {17, 8, 24};
        int[] dineInOrders = {12, 19, 2};
        int[] servedOrders = {17, 8, 19, 12, 24, 2};

        System.out.println(isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders));


    }
}
