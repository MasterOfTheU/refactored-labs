package refactoring;

public class CombSort implements Sort{

    public boolean sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = CombSort.class.getSimpleName();

        int gap = array.length;
        double shrinkFactor = 1.3;
        boolean isSwapped = false;

        while (gap > 1 || isSwapped) {
            if (gap > 1) {
                gap = (int)(gap / shrinkFactor);
            }

            isSwapped = false;

            for (int i = 0; gap + i < array.length; i++) {
                if (array[i] > array[i + gap]) {
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;
                    isSwapped = true;
                }
            }
        }

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of comb sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
        return true;
    }
}