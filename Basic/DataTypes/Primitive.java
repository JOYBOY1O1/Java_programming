package DataTypes;

public class Primitive {
    /*
     * Data Types:
     * Primitive ->byte (1 byte), short (2 bytes), int(4 bytes), long (8
     * bytes),float(4 bytes),double (8 bytes), boolean(1 bit), char (2 bytes).
     */
    public static void main(String[] args) {
        byte u = 56;                //(1 byte) from [-128 to 127]
        short s = 2;                //(2 bytes)
        int n = 123;                //(4 bytes)
        long l = 1234567890l;       //(8 bytes)
        float f = 3.141f;           //(4 bytes)
        boolean b = true;           //(1 bit)
        char c = 'A';               //(2 bytes)
        double d = 43.24312321323d; //(8 bytes)

        System.out.println("Size of Primitive data type depends upon the Data Type.");
        System.out.println("byte : "+u);
        System.out.println("short : "+s);
        System.out.println("int : "+n);
        System.out.println("long : "+l);
        System.out.println("float : "+f);
        System.out.println("boolean : "+b);
        System.out.println("char : "+c);
        System.out.println("double : "+d);
}
}
