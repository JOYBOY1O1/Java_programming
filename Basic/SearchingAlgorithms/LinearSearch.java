package SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {

    static int LSearch(int arr[], int size, int key) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        int arr[];
        arr = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter KEY element to find in array: ");
        int key = sc.nextInt();

        int result = LSearch(arr, size, key);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element = " +key +" found at Index: " + result);
        }

    }
}
