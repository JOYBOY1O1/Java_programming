import java.util.*;

class P3_Scanner
{
    public static void main(String args[]) 
    {   
        /*
            INPUTS

            sc.next();
            sc.nextLine();
            sc.nextInt();
            sc.nextFloat();
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(name);
        System.out.println(num);
    }    
}
