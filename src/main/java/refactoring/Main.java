package refactoring;

import java.util.*;

import static refactoring.UserArray.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ʟᴀʙ 1");
        System.out.println(Greeter.sayHello());

        System.out.println("ʟᴀʙ 2 ᴛᴀsᴋ 1");
        workWithArray();

        System.out.println("ʟᴀʙ 2 ᴛᴀsᴋ 2.1");
        workWithMatrix();
        Thread.sleep(1000);

        System.out.println("ʟᴀʙ 2 ᴛᴀsᴋ 2.2");
        obtainNewMatrix();

        Thread.sleep(1000);

        System.out.println("ʟᴀʙ 3");
        runSort();
    }

    //region obtainNewMatrix
    private static void obtainNewMatrix() {
        int customMatrixOrder = 9;
        CustomMatrix.printObtainedMatrix(customMatrixOrder);
        System.out.println();
    }
    //endregion

    /**
     * Asks user the order of matrix. After the user inputs the order it calculates the sum on main diagonal, above and below it.
     * @see MatrixSum#calculateSum(int, int[][])
     */
    //region workWithMatrix
    private static void workWithMatrix() {
        System.out.println("Enter the order of matrix: ");
        Scanner scan = new Scanner(System.in);
        int matrixOrder = scan.nextInt();
        MatrixSum.calculateSum(matrixOrder, MatrixSum.createUserMatrix(matrixOrder));
        System.out.println();
    }
    //endregion

    /**
     * Asks user the number of array elements. Then in loop user enters values for each item.
     * After filling the array it has to calculate:
     * <ul>
     *     <li>Geometric mean of paired array elements</li>
     *     @see UserArray#geometricMean(ArrayList)
     *     <li>Largest number by module of the array element</li>
     *     @see UserArray#largestByModule(ArrayList)
     *     <li>Maximum paired item in the array</li>
     *     @see UserArray#maximumPairedItem(ArrayList)
     *     <li>Arithmetic mean of the minimum elements of the array</li>
     *     @see UserArray#arithmeticMean(ArrayList)
     *     <li>Module-minimized array element</li>
     *     @see UserArray#findModuleMinimized(ArrayList)
     *     <li>Sum of items in the interval [0; 10]</li>
     *     @see UserArray#findSumInInterval(ArrayList)
     * </ul>
     */
    //region workWithArray
    private static void workWithArray() {
        //User array for filling
        ArrayList<Integer> userArray = new ArrayList<Integer>();
        //Array of paired elements
        ArrayList<Integer> pairedArray = new ArrayList<Integer>();
        System.out.println("Enter the number of array elements: ");
        int userArrayLength = checkInput();
        fillArray(userArrayLength, userArray, pairedArray);
        arrayCalculations(userArray, pairedArray);
        System.out.println();
    }
    //endregion

    //region copyArray
    private static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
    //endregion

    /**
     * Runs all sorting algorithms and gathers runtime performance.
     */
    //region runSort
    public static void runSort() throws InterruptedException {
        Random rand = new Random();
        int arrLength = 150;
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            array[i] = rand.nextInt(1000);
        }

        System.out.println("START ARRAY");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i!=0 && i % 30 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int loopCounter = 0;

        BubbleSort bubble = new BubbleSort();
        OddEvenSort oddEven = new OddEvenSort();
        QuickSort quick = new QuickSort();
        CycleSort cycle = new CycleSort();
        CombSort comb = new CombSort();
        JavaUtilSort javaUtil = new JavaUtilSort();
        SelectionSort selection = new SelectionSort();

        for (int i = 0; i < 3; i++) {
            bubble.sort(copyArray(array));
            oddEven.sort(copyArray(array));
            quick.sort(copyArray(array));
            cycle.sort(copyArray(array));
            comb.sort(copyArray(array));
            javaUtil.sort(copyArray(array));
            selection.sort(copyArray(array));
            loopCounter++;
            System.out.printf("ⒺⓃⒹ ⓁⓄⓄⓅ %d\n", loopCounter);
            System.out.println();
            Thread.sleep(1200);
        }
    }
    //endregion

    //region arraysCalculations
    private static void arrayCalculations(ArrayList<Integer> userArray, ArrayList<Integer> pairedArray) {
        System.out.printf("GEOMETRIC MEAN: %d\n", geometricMean(pairedArray));
        System.out.printf("THE LARGEST NUMBER BY MODULE IS: %d\n", largestByModule(userArray));
        System.out.printf("ARITHMETIC MEAN OF MINIMUM ELEMENTS OF THE ARRAY: %d\n", arithmeticMean(userArray));
        System.out.printf("THE MODULE-MINIMIZED ITEM IS: %d\n", findModuleMinimized(userArray));
        maximumPairedItem(pairedArray);
        findSumInInterval(userArray);
    }
    //endregion

    /**
     * Fills the user array to proceed some calculations.
     * @see Main#arrayCalculations(ArrayList, ArrayList)
     * @param arrayLength - Takes the array length from the user input.
     * @param userArray - Takes empty list to fill it through console.
     *                  @see Main#checkInput()
     * @param pairedArray - The empty list that is created from the user array to proceed calculations with paired items.
     */
    //region fillArray
    private static void fillArray(int arrayLength, ArrayList<Integer> userArray, ArrayList<Integer> pairedArray) {
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter array value");
            userArray.add(checkInput());
            if (userArray.get(i) % 2 == 0) {
                pairedArray.add(userArray.get(i));
            }
        }
    }
    //endregion

    /**
     * Validates the user input, whether it is integer value or not.
     * @return The returned values are returning to the user array.
     * @see Main#fillArray(int, ArrayList, ArrayList)
     */
    //region checkInput
    public static int checkInput() {
        Scanner sc = new Scanner(System.in);
        int output;
        try{
            output = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Element Input error. Enter a number");
            return checkInput();
        }
        return output;
    }
    //endregion
}