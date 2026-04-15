class AreaCalculator {

    // Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class fourth {
    public static void main(String[] args) {

        AreaCalculator calc = new AreaCalculator();

        String shape = "Circle";

        if (shape.equalsIgnoreCase("Circle")) {
            double radius = 7;
            System.out.println("Area: " + calc.area(radius));
        }
        else if (shape.equalsIgnoreCase("Rectangle")) {
            double length = 10;
            double breadth = 5;
            System.out.println("Area: " + calc.area(length, breadth));
        }
        else if (shape.equalsIgnoreCase("Triangle")) {
            double base = 10;
            double height = 6;
            System.out.println("Area: " + calc.area(base, height, true));
        }
    }
}