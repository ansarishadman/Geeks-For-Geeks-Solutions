package com.company;

public class SearchInSortedAndRotatedArray  {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr.length;
        int key = 3;
        int i = search(arr, 0, n-1, key);
        if(i != -1)
            System.out.print("Found in index = " + i);
        else
            System.out.print("Not found");
    }

    static int search(int arr[], int l, int h, int key) {
        if (l > h)
            return -1;
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[l] <= arr[mid]) {
            // first half check
            if (key >= arr[l] && key <= arr[mid]) {
                return search(arr, 0, mid - 1, key);
            }
            // second half check
            return search(arr, mid + 1, h, key);
        }

        // search second half
        if (key >= arr[mid] && key <= arr[h]) {
            return search(arr, mid + 1, h, key);
        }
        return search(arr, l, mid -1, key);
    }
}
