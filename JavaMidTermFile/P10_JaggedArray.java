/*10. Create a jagged array having three rows. Where 1st row contains 3 columns, 2nd row contains 4 columns and 3rd row contains 2 columns. Insert and traverse it.*/
import java.util.Scanner;

public class P10_JaggedArray {
    public static void main(String[] args) {
        int n = 3;
        int Row_Size[] = { 3, 4, 2 };
        Scanner sc = new Scanner(System.in);

        int jagged_array[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            jagged_array[i] = new int[Row_Size[i]];
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Insert Row: " + (i + 1) + " (" + Row_Size[i] + " elements) = ");
            for (int j = 0; j < Row_Size[i]; j++) {
                jagged_array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Traversal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Row_Size[i]; j++) {
                System.out.print(jagged_array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
