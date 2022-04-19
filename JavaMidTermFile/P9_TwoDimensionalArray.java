/*9. Create two dimensional integer array and insert, search and traverse this array.
Note: Use Scanner class to insert data.*/
import java.util.Scanner;

public class P9_TwoDimensionalArray {
    static int n = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int twoD[][] = new int[n][n];

        System.out.print("Insert: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search = ");
        int searchFor = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (twoD[i][j] == searchFor) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println(searchFor + " is Present");
        } else {
            System.out.println(searchFor + " is not Present");
        }

        System.out.println("Traversal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
