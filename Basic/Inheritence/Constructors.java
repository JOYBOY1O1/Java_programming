package Inheritence;

class Base1 {
    Base1() {
        System.out.println("Base Class constructor");
    }
    //contructor overloading
    Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        // super(0); // using super we run immediate parent class contructor 
        System.out.println("Derived Class constructor");
    }
    
    //contructor overloading
    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("Child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y); //this runs contructor with arguments 
        System.out.println("Overloaded constructor of Derived with value of z as: " + z);
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Base1 b = new Base1(); //#runs only Base Class contructor
        // Derived1 d = new Derived1();// #runs Base class contructor first then Derieved class
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}