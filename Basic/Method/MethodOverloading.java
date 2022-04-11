package Method;

// Methods having same name and different parameters.
// Method overloading cannot be done by changing return type of a function. 

public class MethodOverloading {
    
    static void fun() {
        System.out.println("Hi . . .");
    }
    //function(parameters)
    static void fun(int n) {
        System.out.println("Love You " + n +" <3 . . .");
    }
    public static void main(String[] args) {
        fun();
        //function Arguments (Arguments are actual)
        fun(3000);
    }
    
}
