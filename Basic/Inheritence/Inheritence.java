package Inheritence;

class Base {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("In Base Class Setting x");
        this.x = x;
    }

    public void printMe() {
        System.out.println("Contructor");
    }
}

class Derieved extends Base {
    int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        System.out.println("Setting y");
        this.y = y;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        
        Base b = new Base(); //also works with making OBJECT of Derieved Class
        b.setx(4);
        System.out.println(b.getx()); 
        // sety , gety cannot be accessed by Base Class
    }   
}
