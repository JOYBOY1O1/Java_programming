package Inheritence;

class ClassOne {
    int a;

    public int getA() {
        return a;
    }

    ClassOne(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }
}

class ClassTwo extends ClassOne {
    ClassTwo(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
}

public class Super {
    public static void main(String[] args) {
        ClassOne e = new ClassOne(65);
        ClassTwo d = new ClassTwo(5);
        System.out.println(e.getA());
    }
}
