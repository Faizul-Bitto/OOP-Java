//* Base class -> derived class from base class -> another derived class from the previous derived class

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

// Derived class from previous derived class -> Triangle
class EquilateralTriangle extends Triangle {

    public void display() {
        System.out.println("Equilateral.");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {

        EquilateralTriangle triangle = new EquilateralTriangle();
        triangle.area();
        triangle.area(15, 15);
        triangle.display();
    }
}