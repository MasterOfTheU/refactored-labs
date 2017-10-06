package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import refactoring.SortingLibrary;

import java.util.Arrays;
import java.util.Random;


public class SortingLibraryTest {

    private int[] originalArray, arrayForOperations;

    //region fillOriginalArray
    private int[] fillOriginalArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
        }
        return array;
    }
    //endregion

    private static int[] copyArray(int[] originalArray) {
        return Arrays.copyOf(originalArray, originalArray.length);
    }

    @Before
    public void init() {
        originalArray = new int[150];
        fillOriginalArray(originalArray);
    }

    @Test
    public void bubble() {
        arrayForOperations = copyArray(originalArray);
        SortingLibrary bubbleSort = new SortingLibrary();
        bubbleSort.bubble(arrayForOperations);
        Assert.assertNotEquals(originalArray, arrayForOperations);
    }

    @Test
    public void selection() {
        arrayForOperations = copyArray(originalArray);
        SortingLibrary selectionSort = new SortingLibrary();
        selectionSort.selection(arrayForOperations);
        Assert.assertNotEquals(originalArray, arrayForOperations);
    }

    @Test
    public void insertion() {
        arrayForOperations = copyArray(originalArray);
        SortingLibrary insertionSort = new SortingLibrary();
        insertionSort.insertion(arrayForOperations);
        Assert.assertNotEquals(originalArray, arrayForOperations);
    }

}