package sun.study.Sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args){

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        System.out.println(Arrays.toString(shellSort(aryNumber)));
    }

    public static int[] shellSort(int[] array) {

        int len = array.length;
        int temp, gap = len/2;

        while(gap>0){
            for(int i=gap;i<len;i++) {
                temp = array[i];
                int preIndex = i-gap;
                while(preIndex>=0 && array[preIndex] > temp) {
                    array[preIndex+gap] = array[preIndex];
                    preIndex -= gap;
                }

                array[preIndex + gap] = temp;
            }

            gap /= 2;
        }

        return array;
    }
}
