package refactoring;

import java.util.Arrays;

public class JavaUtilSort implements Sort{

    public boolean sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = JavaUtilSort.class.getSimpleName();

        /**
         * @see java.util.Arrays#sort(int[])
         */
        Arrays.sort(array);

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of dual-pivot sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
        return true;
    }
}
