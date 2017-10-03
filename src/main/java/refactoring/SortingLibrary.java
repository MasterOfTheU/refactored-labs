package refactoring;

public class SortingLibrary {
    // Bubble sort swaps values, comparing each set of two and ordering them.
    // This process is repeated until the array has been sorted.
    public int[] bubble(int[] array) {
        // This will cause it to loop through the array until it's sorted.
        // The length of the array will always be enough to fully sort.
        for (int i = 0; i < array.length; i++) {
            // Loop through the array once
            for (int j = 1; j < array.length; j++) {
                // Is the first value in the set of two larger?
                // Then it should go after the smaller value.
                if (array[j - 1] > array[j]) {
                    // Store second value and replace it with first value
                    int temp = array[j];
                    array[j] = array[j - 1];
                    // Make first value what the second was before
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
    // Selection sort goes backwards through the array, finding the highest value and moving them to the end in order.
    public int[] selection(int[] array) {
        // Go through the array once, from last place to first
        for (int i = array.length - 1; i > 0; i--) {
            // The highest number in the starting is always the first.
            int highest = array[0];
            int index = 0;
            // Cycle through all the unsorted numbers, to find the highest
            for (int j = 0; j < i; j++) {
                // Is this number higher than the largest number so far?
                if (array[j] > highest) {
                    // Then replace the current record with this number.
                    highest = array[j];
                    // ...and store which index it's in for later.
                    index = j;
                }
            }
            // After the highest unsorted number has been found, switch the highest number with the last unsorted number.
            int temp = array[i - 1] = highest;
            array[index] = temp;
        }
        return array;
    }
    // Insertion sort, for each item it will find where in the already-sorted items it should be placed do so.
    public static int[] insertion(int[] array) {
        // Loop through the array until sorted.
        for (int i = 1; i < array.length; i++) {
            int index = array[i];
            int j = i;
            // If these aren't the right surrounding numbers, switch the target index up one.
            while ((j > 0) && (array[j - 1] > index)) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            // After the right position has been found, put in the new number.
            array[j] = index;
        }
        return array;
    }
}
