class Student {
    String name;
    int id;
    int roll;
    int age;

    public void printInformationOfTheStudent() {
        System.out.println("Name : " + this.name);
        System.out.println("ID   : " + this.id);
        System.out.println("Roll : " + this.roll);
        System.out.println("Age  : " + this.age);
    }

    Student() {
        System.out.println("Constructor called."); // will be automatically called
    }
}

public class NonParameterizedConstructor {

    public static void main(String[] args) {

        Student john = new Student();
        john.name = "John Doe";
        john.id = 1234567;
        john.roll = 10;
        john.age = 15;

        john.printInformationOfTheStudent();
    }
}
