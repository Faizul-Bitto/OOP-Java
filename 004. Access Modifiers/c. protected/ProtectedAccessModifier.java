/*
 'protected' access modifier means the member is accessible:
    1. Within the same class ✔️
    2. From other classes in the same package ✔️
    3. From subclasses (child classes) even in different packages ✔️

 It cannot be accessed:
    ❌ From non-subclass classes in different packages

 In short: 'protected' = package + inheritance access
*/

// Parent class
class Student {

    protected String name = "John";
}

// Child class
class ChildStudent extends Student {

    public void show() {
        // ✅ Accessing protected variable (because of inheritance)
        System.out.println(name);
    }
}

public class ProtectedAccessModifier {

    public static void main(String[] args) {

        ChildStudent s = new ChildStudent();

        // ✅ Access through child class method
        s.show();

        // ❌ Direct access from main (allowed only if same package)
        // System.out.println(s.name);
    }
}
