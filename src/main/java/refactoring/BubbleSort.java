package refactoring;

public class BubbleSort implements Sort {

    public void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = BubbleSort.class.getSimpleName();
        int temp;

        for (int i = array.length - 1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of bubble sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
    }
}
