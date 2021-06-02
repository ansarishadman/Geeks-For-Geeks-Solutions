package com.company;

// print left rotation of an array in O(n) time and O(1) space

public class LeftRotationWithBigOCons {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        int k = 2;

        leftRotate(arr, n, k);
    }

    static void leftRotate(int arr[], int n, int k) {
        // calculate starting point of rotated array
        int mod = k % n;

        // print array from starting position
        for (int i = 0; i < n; i++)
            System.out.print(arr[(i + mod) % n] + " ");
    }
}

// Alternatively we can utilize Collections.rotate( original arr[], starting position of rotation)
