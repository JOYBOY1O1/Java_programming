/*3.Write a program to sum two numbers. Here inputs are provided through command line argument.*/

public class P3_CommandSum {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]); // first argument
        int num2 = Integer.parseInt(args[1]); // second argument

        int sum = num1 + num2;

        System.out.println("The sum of x and y is: " + sum);
    }
}