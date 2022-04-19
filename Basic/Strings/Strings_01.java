package Strings;

import java.util.Scanner;

public class Strings_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("Your String is: "+ a);
        System.out.println("String.length(): "+ a.length());
        System.out.println("String.toUppercase(): "+ a.toUpperCase());
        System.out.println("String.toLowerCase(): "+ a.toLowerCase());

        sc.close();
    }
}
