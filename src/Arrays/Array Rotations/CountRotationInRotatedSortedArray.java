package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CountRotationInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {13, 15, 18, 2, 3, 6, 12};
        int n = arr.length;
        int count = countRotation(arr, 0, n - 1);
        System.out.println("The count is =" + count);
    }

    static int countRotation(int arr[], int low, int high) {
        // when array is not rotated at all
        if (low > high)
            return 0;

        // when there is only one element left
        if (high == low)
            return low;

        // calculate the mid position of array
        int mid = low + (high - low) / 2;

        // check if mid + 1 is minimum element
        if (mid < high && arr[mid + 1] < arr[mid])
            return mid + 1;

        // check if mid is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;

        // check whether we need to traverse left half or right half
        if (arr[high] > arr[mid])
            return countRotation(arr, low, mid - 1);
        else
            return countRotation(arr, mid + 1, high);
    }
}
