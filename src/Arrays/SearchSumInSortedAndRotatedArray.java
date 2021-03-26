package com.company;

public class SearchSumInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 7, 9, 10};
        int sum = 16;
        int n = arr.length;

        boolean foundIndex = pairsInSortedAndRotatedArray(arr, n , sum);
        System.out.print(foundIndex ? "Sum exists" : "Sum doesn't exist");
    }

    static boolean pairsInSortedAndRotatedArray(int arr[], int n, int sum) {
        int i;
        for(i = 0; i < n-1; i++)
            if (arr[i] > arr[i + 1])
                break;

        int l = (i + 1) % n;
        int r = i;

        while (l != r) {
            if (arr[l] + arr[r] == sum)
                return true;

            if (arr[l] + arr[r] < sum)
                l = l + 1;
            else
                r = (r + n -1) % n;
        }
        return false;
    }
}
