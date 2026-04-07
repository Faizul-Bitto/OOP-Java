/*
 * 'default' access modifier (no keyword) means the member is accessible:
 * 1. Within the same class ✔️
 * 2. From other classes in the same package ✔️
 * 3. From subclasses in a different package ❌
 * 4. From non-subclass classes in a different package ❌
 * 
 * In short: 'default' = package-private access (only within the same package)
 */

// Parent class
class Student {

    // No modifier = default access
    String name = "John";

    // Default method
    void showName() {
        System.out.println(name);
    }
}

public class DefaultAccessModifier {

    public static void main(String[] args) {

        Student s = new Student();

        // ✅ Accessible because same package
        System.out.println(s.name);
        s.showName();
    }
}

// If we create another class in a different package:
// ❌ Cannot access s.name or s.showName()