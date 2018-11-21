package JamesKo;

import java.util.Arrays;

public class InPlaceSorts {

    public static void swapInt(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void swapDouble(double[] arr, int a, int b)
    {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void swapString(String[] arr, int a, int b)
    {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    public static void bubbleSort(String[] arr)
    {
        for (int a = 0; a < arr.length; a++)
        {
            for (int b = 0; b < arr.length - a - 1; b++) {
                if (arr[b].compareTo(arr[b+1]) > 0) {
                    swapString(arr, b, b + 1);
                }
            }
        }

    }

    public static void selectionSort(double[] arr)
    {
        for(int a = 0; a < arr.length - 1; a++)
        {
            int min = a;
            for(int b = a + 1; b<arr.length; b++)
            {
                if(arr[b] < arr[min])
                {
                    min = b;
                }
            }
            if(min != a)
            {
                swapDouble(arr, a, min);
            }

        }
    }

    public static void insertionSort(int[] arr){
        for(int a = 1; a < arr.length; a++) {
            int mainValue = arr[a];
            int b = a-1;

            while (b>=0 && arr[b] > mainValue)
            {
                arr[b+1] = arr[b];
                b = b-1;
            }
            arr[b+1] = mainValue;
        }
    }

    public static int[] randomNum(int count)
    {
        int[] arr = new int[count];
        for(int a = 0; a < arr.length; a++)
        {
            arr[a] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randomDouble(int count)
    {
        double[] arr = new double[count];
        for(int a = 0; a < arr.length; a++)
        {
            arr[a] = Math.random()*10000.0;
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while(num>0)
        {
            int i =0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }
}

