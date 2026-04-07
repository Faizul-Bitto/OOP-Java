/*
 'private' access modifier means the member is accessible only within the same class
 It cannot be accessed:
    1. From other classes (even in the same package)
    2. From different packages 

 To access private members from outside:
    ✔ Use public getter methods → to read value
    ✔ Use public setter methods → to modify value

 In short: 'private' = fully restricted (only inside the class)
 Access possible only through methods (controlled access)
*/

//! Example:
class Student {

    // Private variable (cannot be accessed directly from outside)
    private String name = "John";

    // Public method to access private variable (getter)
    public String getName() {
        return this.name;
    }

    // Public method to modify private variable (setter)
    public void setName(String name) {
        this.name = name;
    }
}

public class PrivateAccessModifier {

    public static void main(String[] args) {

        // Creating object of Student class
        Student student1 = new Student();

        // This will give ERROR (cannot access private variable)
        // System.out.println(student1.name);

        // Accessing using public getter method
        System.out.println(student1.getName());

        // Modifying using setter
        student1.setName("Jane");
        System.out.println(student1.getName());
    }
}
