//* Base class -> derived class
//* More derived classes from base class
//* Also contains derived classes from the previous derived classes

// Base class
class Shape {

    public void area() {
        System.out.println("Displayed area.");
    }
}

// Derived class from base class -> Shape
class Triangle extends Shape {

    public void area(int height, int length) {
        System.out.println(0.5 * (height * length));
    }
}

// Derived class from previous derived class -> Triangle
class EquilateralTriangle extends Triangle {

    public void display() {
        System.out.println("Equilateral.");
    }
}

// derived from base class -> Shape
class Circle extends Shape {

    public void area(int r) {
        System.out.println(3.14 * (r * r));
    }
}

public class HybridInheritance {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.area();
        triangle.area(15, 15);
        System.out.println("\n");

        Circle circle = new Circle();
        circle.area();
        circle.area(15);
        System.out.println("\n");

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.area();
        equilateralTriangle.area(15, 15);
        equilateralTriangle.display();
    }
}