package refactoring;

public class OddEvenSort implements Sort {

    public boolean sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = OddEvenSort.class.getSimpleName();
        boolean isSorted = false;

        while (!isSorted) {
            int temp;
            isSorted = true;

            //Swapping elements at odd positions
            for (int i = 1; i < array.length - 1; i += 2) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }

            //Swapping elements at even positions
            for (int i = 0; i < array.length - 1; i += 2) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of bubble sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
        return true;
    }
}