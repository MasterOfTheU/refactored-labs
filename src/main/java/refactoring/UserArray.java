package refactoring;

import java.util.*;

public class UserArray {

    //region geometricMean
    public static int geometricMean(ArrayList<Integer> pArray) {
        double result = 1.0;
        for (int i = 0; i < pArray.size(); i++) {
            result *= pArray.get(i);
        }
        return (int) Math.pow(result, 1.0 / pArray.size());
    }
    //endregion

    //region maximumPairedItem
    public static void maximumPairedItem(ArrayList<Integer> pArray) {
        int max = pArray.get(0);
        try {
            for (int i = 0; i < pArray.size(); i++) {
                if (pArray.get(i) > max) {
                    max = pArray.get(i);
                }
            }
            System.out.printf("THE MAXIMUM PAIRED ITEM IS: %d\n", max);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.printf("The array does not contain any paired numbers.\n");
        }
    }
    //endregion

    //region largestByModule
    public static int largestByModule(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (Math.abs(array.get(i)) > Math.abs(max)) {
                max = array.get(i);
            }
        }
        return Math.abs(max);
    }
    //endregion

    //region arithmeticMean
    public static int arithmeticMean(ArrayList<Integer> array) {
        int intermediateValue,
                intermediateSum = 0,
                sum = 0,
                result;

        ArrayList<Integer> minElements = new ArrayList<Integer>();

        //Finding the mean value of start array
        for (int i = 0; i < array.size(); i++) {
            intermediateSum += array.get(i);
        }
        intermediateValue = intermediateSum / array.size();

        //Creating the array with min elements
        if (array.size() >= 2) {
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) < intermediateValue) {
                    minElements.add((array.get(i)));
                }
            }

            //Finding the mean value of array with minimum elements
            for (int i = 0; i < minElements.size(); i++) {
                sum += minElements.get(i);
            }

            result = sum / minElements.size();

        } else {
            result = array.get(0);
        }
        return result;
    }
    //endregion

    //region findModuleMinimized
    public static int findModuleMinimized(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if ( Math.abs(array.get(i)) < Math.abs(min) ) {
                min = array.get(i);
            }
        }
        return Math.abs(min);
    }
    //endregion

    //region findSumInInterval
    public static void findSumInInterval(ArrayList<Integer> array) {
        int sum = 0, topBound = 9;
        try {
            for (int i = 0; i < topBound; i++) {
                sum += array.get(i);
            }
            System.out.printf("THE SUM IN INTERVAL [0-10] IS: %d\n", sum);
            //return sum;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.printf("Cannot proceed the calculation of sum in the interval of [0;10]. The array does not contain this amount of elements.\n");
        }
    }
    //endregion
}
