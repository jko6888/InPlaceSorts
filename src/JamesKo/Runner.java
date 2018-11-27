package JamesKo;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] arr = InPlaceSorts.randomNum(500);
        System.out.println(Arrays.toString(arr) + "\n Loading...");
        InPlaceSorts.insertionSort(arr);
        System.out.println(Arrays.toString(arr) + "\n Finished");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println(" ");

        double[] arrDouble = InPlaceSorts.randomDouble(500);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrDouble) + "\n Loading...");
        InPlaceSorts.selectionSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble) + "\n Finished");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println(" ");

        String[] arrString = InPlaceSorts.randomStringArr(500, 4);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrString) + "\n Loading..");
        InPlaceSorts.bubbleSort(arrString);
        System.out.println(Arrays.toString(arrString) + "\n Finished");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println(" ");

        int[] mergeArr = InPlaceSorts.randomNum(10);
        System.out.println(Arrays.toString(mergeArr) + "\n Loading...");
        InPlaceSorts.mergeSort(mergeArr);
        System.out.println(Arrays.toString(mergeArr) + "\n Finished");

        int[] quickSortArr = InPlaceSorts.randomNum(10);
        System.out.println(Arrays.toString(quickSortArr) + "\n Loading...");
        InPlaceSorts.quickSort(quickSortArr,0,9);
        System.out.println(Arrays.toString(quickSortArr) + "\n Finished");
    }
}
