package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import refactoring.*;

/**
 * Class <i>SortTest</i> provides information about the equality of arrays <b>before </b>and <b>after</b> the sort,
 * in order to convince the developer that all metrics are calculated properly
 * and all the calculations are conducted on the unsorted array.
 */
public class SortTest {

    private int[] originalArray, arrayForCalculations;

    @Before
    public void init() {
        Random rand = new Random();
        int arrLength = 150;
        originalArray = new int[arrLength];

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = rand.nextInt(100);
        }
    }

    private int[] fillArray(){
        arrayForCalculations = Arrays.copyOf(originalArray, 150);
        return arrayForCalculations;
    }

    @Test
    public void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        fillArray();
        bubbleSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }

    @Test
    public void cycleSortTest() {
        CycleSort cycleSort = new CycleSort();
        fillArray();
        cycleSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }

    @Test
    public void oddEvenSortTest() {
        OddEvenSort oddEvenSort = new OddEvenSort();
        fillArray();
        oddEvenSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }

    @Test
    public void quickSort() {
        QuickSort quickSort = new QuickSort();
        fillArray();
        quickSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }

    @Test
    public void selectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        fillArray();
        selectionSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }

    @Test
    public void combSort() {
        CombSort combSort = new CombSort();
        fillArray();
        combSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }

    @Test
    public void javaUtilSort() {
        JavaUtilSort combSort = new JavaUtilSort();
        combSort();
        combSort.sort(arrayForCalculations);
        Assert.assertFalse(originalArray == arrayForCalculations);
    }
}