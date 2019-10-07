package sun.study.Sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        System.out.println(Arrays.toString(insertionSort(aryNumber)));
    }

    public static int[] insertionSort(int[] array){

        if (array.length == 0)
            return array;

        int current;

        for(int i=0; i<array.length-1; i++){

            current = array[i+1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = current;
        }

        return array;
    }
}
