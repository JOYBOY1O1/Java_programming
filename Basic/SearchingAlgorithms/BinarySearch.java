package SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    int BSearch(int arr[], int begin, int end, int key) {
        int mid = (begin + end) / 2; // mid = begin + (end - begin)/2 advantage (does not overflow quickly)

        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] < key) {
            return BSearch(arr, mid + 1, end, key);
        }
        if (arr[mid] > key) {
            return BSearch(arr, begin, end - 1, key);
        }
        if (end < begin) {
            return -1;
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch obj = new BinarySearch();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to be found: ");
        int key = sc.nextInt();
        int result = obj.BSearch(arr, 0, size - 1, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        sc.close();
    }
}