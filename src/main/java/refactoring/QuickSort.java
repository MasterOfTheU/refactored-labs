package refactoring;

import java.util.Random;

public class QuickSort implements Sort {
    public boolean sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = QuickSort.class.getSimpleName();

        /** Choosing the pivot element randomly from our array */
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        int pivot = array[index];

        int bottomBound = 0, topBound = array.length - 1;
        /** Checking lists from both side of pivot element */
        while (bottomBound <= topBound) {
            while (array[bottomBound] < pivot) {
                bottomBound++;
            }

            while (array[topBound] > pivot) {
                topBound--;
            }

            if (bottomBound <= topBound) {
                int temp = array[bottomBound];
                array[bottomBound] = array[topBound];
                array[topBound] = temp;
                bottomBound++;
                topBound--;
            }

        }

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of quick sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
        return true;
    }
}
