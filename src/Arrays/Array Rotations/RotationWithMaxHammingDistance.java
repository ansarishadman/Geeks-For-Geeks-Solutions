package com.company;

public class RotationWithMaxHammingDistance {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8};
        int n = arr.length;

        System.out.print(maxHamming(arr, n));
    }

    static int maxHamming(int arr[], int n) {
        // copy arr[] twice to a new arr
        int brr[] = new int[2 * n + 1];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            brr[i + 1] = arr[i];
        }
        // hamming distance for 0 rotation is 0
        int maxHam = 0;

        // rotate one by one and calc() max hamming distance
        for (int i = 0; i < n; i++) {
            int currHam = 0;
            for (int j = i, k = 0; j < i + n; j++, k++) {
                if (brr[j] != arr[k])
                    currHam++;

                // hamming distance cannot be more than n
                if (currHam == n)
                    return n;

                maxHam = Math.max(maxHam, currHam);
            }
        }
        return maxHam;
    }
}
