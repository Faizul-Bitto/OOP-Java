//* Base class -> derived class
//* More derived classes from base class

// Base class
class Shape {

    public void area() {
        System.out.println("Displayed area");
    }
}

// Derived class
class Triangle extends Shape {

    public void area(int height, int length) {
        System.out.println(0.5 * (height * length));
    }
}

// derived from base class
class Circle extends Shape {

    public void area(int r) {
        System.out.println(3.14 * (r * r));
    }
}

public class HierarchialInheritance {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.area();
        triangle.area(15, 15);

        Circle circle = new Circle();
        circle.area();
        circle.area(15);
    }
}