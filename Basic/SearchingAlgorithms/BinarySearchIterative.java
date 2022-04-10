package SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearchIterative {

    int binarySearch(int arr[], int size, int key) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {

        BinarySearchIterative obj = new BinarySearchIterative();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        System.out.print("Enter elements of array: ");

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to be found: ");
        int key = sc.nextInt();

        int result = obj.binarySearch(arr, size, key);

        if (result == -1)
            System.out.println("Element not present");

        else
            System.out.println("Element found at index " + result);
    }
}
