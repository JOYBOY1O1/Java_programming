package Operators;

/*
OPERATORS in Java
Assignment Operator [=]
*/
public class Assignment {
    public static void main(String[] args) {
        System.out.println("(=) is and assignment operator , which assigns the value to a specific variable");

        int n1 = 45, n2 = 55; // assigns value
        System.out.println(n1+n2);  
        n1 += 5;
        System.out.println(n1);  
        System.out.println(n1+n2); 

        n1 -= 15;   // 50 - 15
        System.out.println(n1);  
        
        n1 *= 5;    // 35 * 5
        System.out.println(n1);  
        
        n1 /= 5;    //175 / 5
        System.out.println(n1);  
        
        n1 %= 5;    //35 % 5 remainder = 0
        System.out.println(n1);  
    }
}
