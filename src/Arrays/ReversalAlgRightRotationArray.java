package com.company;

public class ReversalAlgRightRotationArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int k = 3;

        rightRotate(arr, n, k);

        printArray(arr, n);
    }

    static void rightRotate(int arr[], int n, int d) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
