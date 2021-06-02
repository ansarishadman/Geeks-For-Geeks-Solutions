package com.company;
import java.util.Arrays;

public class MaxSumWithOnlyRotations {
    static int arr[] = new int[]{ 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    static int maxSum() {
        int arrSum = 0;
        int currVal = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arrSum = arrSum + arr[i];
            currVal = currVal + (i * arr[i]);
        }

        int maxVal = currVal;

        for (int k = 1; k < n; k++) {
            currVal = currVal + arrSum - n * arr[n - k];
            if (currVal > maxVal) {
                maxVal = currVal;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.println("The maximum sum is = " + maxSum());
    }
}
