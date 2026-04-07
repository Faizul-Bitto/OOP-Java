/*
 //? What is Encapsulation? : Encapsulation means wrapping data (variables) and methods that work on that data together in a class and controlling access to them.
 
 //* Why use encapsulation? : 
  1. Protects data from unwanted access/modification
  2. Provides controlled access using getter and setter methods
  3. Makes code more secure and maintainable
*/

class Student {

    // Private variables → cannot be accessed directly from outside
    private String name;
    private int age;

    // Public getter method → to read value
    public String getName() {
        return name;
    }

    // Public setter method → to modify value
    public void setName(String newName) {
        if (newName != null && !newName.isEmpty()) { 
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) { 
            age = newAge;
        }
    }

    // Method to display student info
    public void showInformation() {
        System.out.println("Name : " + name + " & Age : " + age);
    }
}

public class EncapsulationConcept {

    public static void main(String[] args) {

        Student john = new Student();

        // ✅ Modify private variables using setter
        john.setName("John Doe");
        john.setAge(15);

        // ✅ Access private variables using getter
        System.out.println("Name : " + john.getName());
        System.out.println("Age  : " + john.getAge());

        // ✅ Display combined info using class method
        john.showInformation();
    }
}