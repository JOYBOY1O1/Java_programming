/*11. Create a class “Shape” having area() method to calculate area. Overload the area() method for shapes like triangle, rectangle and circle. */

public class P11_Shape {
    // Circle
    static Double Area(Double a) {
        return 22 * a * a / 7;
    }
    // Rectangle
    static Double Area(Double a, Double b) {
        return a * b;
    }
    // Triangle
    static Double Area(Double a, Double b, Double c) {
        Double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        // Circle
        System.out.println("Area of Circle: "+Area(2d));
        // Rectangle
        System.out.println("Area of Rectangle: "+Area(2d, 3d));
        // Triangle
        System.out.println("Area of Triangle: "+Area(2d, 3d, 4d));
    }
}
