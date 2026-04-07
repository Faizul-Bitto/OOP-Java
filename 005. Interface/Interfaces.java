interface Animal {

    int eyes = 2; // fixed and public

    void walk(); // by default abstract (no abstract keyword needed), public, static and final

    // no constructors allowed
    /*
     * Animal(){}
     */

    // non-abstract methods not allowed
    /*
     * void eat(){}
     */
}

class Horse implements Animal {

    // should be public
    public void walk() {

        System.out.println("Walks on 4 legs.");
    }
}

public class Interfaces {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walk();
    }
}
