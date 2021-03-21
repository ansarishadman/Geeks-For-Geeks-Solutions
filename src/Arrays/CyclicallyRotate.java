package com.company;

import java.util.Arrays;

public class CyclicallyRotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        CyclicallyRotate cycRot = new CyclicallyRotate();
        cycRot.rotate(arr, n);
        cycRot.printRotate(arr, n);
    }

    void rotate(int arr[], int n) {
        int temp = arr[n-1];
         for (int i = n-1; i > 0; i--) {
             arr[i] = arr[i-1];
         }
        arr[0] = temp;
    }

    void printRotate(int arr[], int n) {
            System.out.print(Arrays.toString(arr));
    }
}
