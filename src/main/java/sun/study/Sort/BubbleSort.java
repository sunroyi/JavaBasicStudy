package sun.study.Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){

        System.out.println("151345".hashCode());

        int[] aryNumber = {1,6,4,8,9,130,6,848,132,0,6,6,6,6};

        aryNumber = mpSort(aryNumber);

        halfSearch(aryNumber, 6);

    }

    // 冒泡排序
    public static int[] mpSort(int[] aryNumber){
        int swap = 0;
        for(int i=0;i<aryNumber.length;i++){
            for(int j=i+1;j<aryNumber.length;j++){
                if (aryNumber[i]>aryNumber[j]) {
                    swap = aryNumber[i];
                    aryNumber[i] = aryNumber[j];
                    aryNumber[j] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(aryNumber));

        return aryNumber;
    }

    public static void halfSearch(int[] aryNumber, int target){

        int ret = 0;
        int low = 0;
        int high = aryNumber.length-1;
        int mid = 0;

        while(low <= high) {
            mid = (low + high)/2;
            if(aryNumber[mid] == target) {
                System.out.println(mid);
                ret++;
                for(int i=mid+1;i<high;i++){
                    if (aryNumber[i]==target){
                        System.out.println(i);
                        ret++;
                    }else{
                        break;
                    }
                }
                for(int i=mid-1;i>low;i--){
                    if (aryNumber[i]==target){
                        System.out.println(i);
                        ret++;
                    }else{
                        break;
                    }
                }
                break;
            }else if (aryNumber[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        System.out.println("Find " + ret);
    }
}
