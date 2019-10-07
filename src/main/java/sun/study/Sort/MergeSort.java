package sun.study.Sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        System.out.println(Arrays.toString(mergeSort(aryNumber)));
    }

    public static int[] mergeSort(int[] array) {

        if(array.length<2)
            return array;

        int mid = array.length/2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        for(int index=0,i=0,j=0;index<result.length;index++) {
            if (i>=left.length)
                result[index] = right[j++];
            else if (j>=right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }

        return result;
    }
}
