/*
 'public' access modifier means the member is accessible from anywhere
 It can be accessed:
    1. Within the same class
    2. From other classes in the same package
    3. From classes in different packages

 In short: 'public' = no access restriction (fully open)   
*/

//! Example:
class Student {

    // This variable is public, so it can be accessed from anywhere
    public String name = "John";

    // This method is also public
    public void showName() {
        System.out.println(name);
    }
}

public class PublicAccessModifier {

    public static void main(String[] args) {

        // Creating object of Student class
        Student student1 = new Student();

        // Accessing public variable
        System.out.println(student1.name);

        // Accessing public method
        student1.showName();
    }
}