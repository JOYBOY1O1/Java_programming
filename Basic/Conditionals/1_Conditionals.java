package Conditionals;

import java.util.*;

class Conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an Adult");
        } else
            System.out.println("You are a Minor");
    }
}
