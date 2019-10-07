package sun.study.Sort;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args){

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        System.out.println(Arrays.toString(quickSort(aryNumber,0,aryNumber.length-1)));
    }

    public static int[] quickSort(int[] array, int start, int end) {
        if (start>=end)
            return array;

        // 获取start元素在整个数组中的正确位置，start左边的值都比start小，右边都比start大
        int index = getIndex(array, start, end);

        quickSort(array, 0, index-1);
        quickSort(array, index+1, end);

        return array;
    }

    // 获取start元素在整个数组中的正确位置，start左边的值都比start小，右边都比start大
    public static int getIndex(int[] array, int start, int end){

        int temp = array[start];
        int index = start;
        start++;

        while(start<=end) {
            if (index < start){
                // 比较末尾
                if (array[end] <= temp) {
                    array[index] = array[end];
                    index = end;
                }
                end--;
            }else if(index > end){
                // 比较头部
                if (temp <= array[start]){
                    array[index] = array[start];
                    index = start;
                }
                start ++;
            }
        }

        array[index] = temp;

        return index;
    }

    public void swap(int[] array, int start, int end){

    }
}
