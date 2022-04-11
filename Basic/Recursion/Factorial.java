package Recursion;

// Recursion a function which calls itself
// n >= 1 (should be always true)
public class Factorial {
    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("5 Factorial is : " + factorial(n));
    }
}
