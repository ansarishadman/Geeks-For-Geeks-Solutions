package com.company;

public class MultipleLeftRotationsInArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;

        int k = 4;
        leftRotate(arr, n, k);
        System.out.println();
    }

    static void leftRotate(int arr[], int n, int k) {
        for (int i = k; i < k + n; i++) {
            System.out.print(arr[i % n] + " ");
        }
    }
}
