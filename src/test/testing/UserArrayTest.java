package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

import refactoring.Main;
import refactoring.UserArray;

/** <b>UserArrayTest</b> is used to check methods for array calculations.
 * Consider the elements are scanning from user console.
 */
public class UserArrayTest {

    /** Array for the first part of Lab2. */
    private ArrayList<Integer> originalArray;

    /**
     * @param array - @see UserArray#originalArray
     * @return filled array
     */

    //region fillOriginalArray
    private ArrayList<Integer> fillOriginalArray(ArrayList<Integer> array) {
        Random rand = new Random();
        for (int i = 0; i < array.size(); i++) {
            array.add(rand.nextInt(50));
        }
        return array;
    }
    //endregion

    /** <b>fillPairedArray</b> fills the array with paired elements for finding their geometrical mean.
     * @see UserArrayTest#arithmeticMean()
     * @param testList - Original list with elements that will be used to fill the paired list.
     * @return pairedList - Obtained list with paired items.
     */

    //region fillPairedArray
    private List<Integer> fillPairedArray(List<Integer> testList) {
        List<Integer> pairedList = new ArrayList<Integer>();
        for (int i = 0; i < testList.size(); i++) {
            testList.add(Main.checkInput());
            if (testList.get(i) % 2 == 0) {
                pairedList.add(testList.get(i));
            }
        }
        return pairedList;
    }
    //endregion

    @Before
    public void init() {
        originalArray = new ArrayList<Integer>(150);
        fillOriginalArray(originalArray);
    }

    @Test
    public void checkNullArray() {
        assertNotNull(originalArray);
    }

    @Test
    public void geometricMean() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 4));
        int actualResult = UserArray.geometricMean((ArrayList<Integer>) testList);
        int expected = 2;
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void geometricMeanFailed() {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        Assert.assertFalse(testList.size() > 0);
    }

    @Test
    public void pairedListNotNull() {
        List<Integer> testList = new ArrayList<Integer>(5);
        List<Integer> result = fillPairedArray(testList);
        Assert.assertNotNull(result);
    }

    @Test
    public void largestByModule() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 0, -566, 11));
        int actualResult = UserArray.largestByModule((ArrayList<Integer>) testList);
        int expected = 566;
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void largestByModuleFailed() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(-9999, 66, 23, 0, 1));
        int actualResult;
        int expected = -9999;
        actualResult = UserArray.largestByModule((ArrayList<Integer>) testList);
        actualResult = -(actualResult);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void arithmeticMean() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 10, 4, 5));
        int actualResult = UserArray.arithmeticMean((ArrayList<Integer>) testList);
        int expected = 2;
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void findModuleMinimized() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 0, -566, 11));
        int actualResult = UserArray.findModuleMinimized((ArrayList<Integer>) testList);
        int expected = 0;
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void findSumInInterval() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 0, -566, 11));
        boolean result = UserArray.findSumInInterval((ArrayList<Integer>) testList);
        Assert.assertTrue(result);
    }

    @Test
    public void maximumPairedItem() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 1, 0, 4, 22, 3));
        boolean result = UserArray.maximumPairedItem((ArrayList<Integer>) testList);
        Assert.assertTrue(result);
    }
}
