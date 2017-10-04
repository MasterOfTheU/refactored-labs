package refactoring;

public class Metrics {
    /**
     * Prints the name of recently executed method.
     * @param methodName - Gets the name of the executed sorting algorithm from the class name.
     */
    static void printMethodName(String methodName) {
        System.out.printf("%s has executed.\n", methodName);
    }

    /**
     * @param bytes - Gets the amount of used memory in app runtime.
     * @return bytes converted to megabytes.
     */
    private static double bytesToMegabytes(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }

    /**
     * Gathers metrics of sorting algorithms.
     */
    public static boolean gatherPerformance() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.printf("Used memory in bytes: %d; in megabytes: %f \n", memory, bytesToMegabytes(memory));
        return true;
    }

}
