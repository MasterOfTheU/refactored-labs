package refactoring;

public class SelectionSort implements Sort {

    public void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        String methodName = SelectionSort.class.getSimpleName();

        //Using third-party library
        SortingLibrary lib = new SortingLibrary();
        lib.selection(array);

        Metrics.printMethodName(methodName);
        Metrics.gatherPerformance();
        long endTime   = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.printf("The runtime of selection sort algorithm is %d %s\n", elapsedTime, "ms");
        System.out.println();
    }
}
