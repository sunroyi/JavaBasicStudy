package sun.study.Sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        System.out.println(Arrays.toString(selectionSort(aryNumber)));
    }

    public static int[] selectionSort(int[] array){

        if (array.length==0)
            return array;

        for(int i=0;i<array.length;i++){
            int minIndex = i;

            for(int j=i;j<array.length;j++){

                if (array[j] < array[minIndex])
                    minIndex = j;
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
