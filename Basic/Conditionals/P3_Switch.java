package Conditionals;

import java.util.Scanner;

public class P3_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose an option ([1][2][3]):");
        int age = sc.nextInt();

        switch (age) {
            case 1:
                System.out.println("Welcome to Java Programming");
                break;

            case 2:
                System.out.println("Beginner level");
                break;

            case 3:
                System.out.println("Pro Level");
                break;

            default:
                System.out.println("Invalid option");
            sc.close();
        }

    }
}