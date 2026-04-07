//? What is polymorphism? : Polymorphism means one name can be used for different behaviors (same method name, different work).

//* Why use same name for different methods ? : It makes code easy to read and understand. We group similar actions under one name.

//* Rules : 
// 1. Method name must be same.
// 2. Parameters must be different (different number or different data type).
// 3. Return type can be same or different, but you cannot change only return type to overload.

//* Example idea : add(int a, int b) and add(int a, int b, int c) -> same name, different parameters, so different behavior.

//* Multiple methods with same name but different parameters is called method overloading.

class Student {
    String name;
    int age;

    public void printInformationOfTheStudent(String name) {
        System.out.println("Name : " + name);
    }

    public void printInformationOfTheStudent(int age) {
        System.out.println("Age  : " + age);
    }

    public void printInformationOfTheStudent(String name, int age) {
        System.out.println("Name : " + name + " & " + " Age : " + age);
    }
}

public class PolymorphismConcept {

    public static void main(String[] args) {

        Student john = new Student();
        john.name = "John Doe";
        john.age = 15;

        john.printInformationOfTheStudent(john.name);
        john.printInformationOfTheStudent(john.age);
        john.printInformationOfTheStudent(john.name, john.age);
    }
}
