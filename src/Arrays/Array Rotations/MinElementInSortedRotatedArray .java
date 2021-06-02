package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinElementInSortedRotatedArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 2, 3, 4};
        int n = arr.length;

        int minValue = searchMinElement(arr, 0, n - 1);
        System.out.println("Min value in array is " + minValue);
    }

    static int searchMinElement(int arr[], int low, int high) {
        // when array is not rotated at all
        if (high < low) return arr[0];

        // check if only one element in array
        if (low == high)
            return arr[high];

        // find the middle index
        int mid = low + (high - low) / 2;

        // check if middle + 1 element is minimum
        if (arr[mid] > arr[mid + 1] && mid < high)
            return arr[mid + 1];

        // check if mid element is shortest
        if (arr[mid] < arr[mid - 1] && mid > low)
            return arr[mid];

        //check whether minimum value lies in left or right half
        if (arr[high] > arr[mid])
            return searchMinElement(arr, low, mid - 1);

        return searchMinElement(arr, mid + 1, high);

    }
}
