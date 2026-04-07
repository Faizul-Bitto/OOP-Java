/*
 //? What is Abstraction? : Abstraction means hiding unnecessary details and showing only the essential features of an object.
 
 //* Why use abstraction? :
    1. Focus on what an object does instead of how it does it
    2. Helps reduce complexity
    3. Supports code reusability and maintainability
*/

abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("Eats.");
    }
}

class Cat extends Animal {
    public void walk() {
        System.out.println("Walks with 4 legs.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks with 2 legs.");
    }
}

public class AbstractionConcept {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.walk();
        cat.eat();

        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();

        // This will not be executed as it is abstract
        // Animal animal = new Animal(); // Animal is abstract; cannot be instantiated
        // animal.walk();
    }
}