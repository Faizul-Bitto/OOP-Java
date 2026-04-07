//* Base class and derived class

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

public class SingleLevelInheritance {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.area();
        triangle.area(15, 15);
    }
}