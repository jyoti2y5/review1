package com.bridgelab.review1;
import java.util.Arrays;


public class NegativeInBeginning {
    public static void main(String[] args){
        int temp;
        int j=0;
        int[] arr={2,-1,5,7,-4,-3,9};
        for (int i=0;i< arr.length;i++) {
            if (arr[i] < 0)
            {
                if (i != j)
                {

                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
                j++;
            }

        }System.out.println(Arrays.toString(arr));
    }
}
