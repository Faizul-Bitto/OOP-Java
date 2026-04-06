class Pen {
    String color;
    String type;

    public void colorAndType() {
        System.out.println("The pen color is : " + this.color + ". And the type of the pen is : " + this.type);
    }
}

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
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        // ! pen related
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Gel";
        pen1.colorAndType();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ballpoint";
        pen2.colorAndType();

        // ! student related
        Student john = new Student();
        john.name = "John Doe";
        john.id = 1234567;
        john.roll = 10;
        john.age = 15;

        john.printInformationOfTheStudent();
    }
}