class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInformationOfTheStudent() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {

        Student john = new Student("John Doe", 15);

        john.printInformationOfTheStudent();
    }
}
