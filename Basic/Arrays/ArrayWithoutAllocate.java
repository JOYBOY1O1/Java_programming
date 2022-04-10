package Arrays;
/*
Use String to take input and then convert
use it using Integer.parseInt().
Using this you don't have to allocate an oversized array.
*/

import java.util.Scanner;

public class ArrayWithoutAllocate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in String: ");
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + Integer.parseInt(arr[i]));
        }
        System.out.println("\nSize of array: " + arr.length );
    }
}
