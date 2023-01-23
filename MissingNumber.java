package com.bridgelab.review1;

public class MissingNumber {
    public static void main(String[] args){
        int[]arr={2,3,5,7,1,8,10,6,9};
        int n=arr.length+1;
        int sum=(n*(n+1))/2; //formula 1-n no. in series
        for(int i=0;i< arr.length;i++){
            sum=sum-arr[i];
        }
        System.out.println("Missing number:"+sum);
    }
}
