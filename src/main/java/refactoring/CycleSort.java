package refactoring;

public class CycleSort implements Sort {

    public void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = CycleSort.class.getSimpleName();

        for (int cycleStart = 0; cycleStart < array.length - 1; cycleStart++) {
            int currentItem = array[cycleStart];

            /** Counting the number of elements that are less than current item. */
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < array.length; i++) {
                if (array[i] < currentItem) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            /** Skipping the duplicates. */
            while (currentItem == array[pos]) {
                pos++;
            }

            int temp = array[pos];
            array[pos] = currentItem;
            currentItem = temp;

            /** Repeat the cycle until all the values are swapped. */
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < array.length; i++) {
                    if (array[i] < currentItem) {
                        pos++;
                    }
                }

                while (currentItem == array[pos]) {
                    pos++;
                }

                temp = array[pos];
                array[pos] = currentItem;
                currentItem = temp;
            }
        }

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of cycle sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
    }
}
