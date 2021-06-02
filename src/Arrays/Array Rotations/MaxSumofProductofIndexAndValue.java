package com.company;

import java.util.Arrays;

public class MaxSumofProductofIndexAndValue {
    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
        int n = arr.length;

        int maxSumValue = maxSum(arr, n);
        System.out.print("Max. sum value is " + maxSumValue);
    }

    static int maxSum(int arr[], int n) {
       int arrSum = 0;
       int currVal = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        for (int i = 1; i < n; i++) {
            currVal += arrSum - n * arr[n-i];

            if(currVal > maxVal)
                maxVal = currVal;
        }
        return maxVal;
    }
}
