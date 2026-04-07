interface Animal {

    int eyes = 2;

    void walk();

}

interface Herbivore {

    void herbivore();
}

class Horse implements Animal, Herbivore {

    public void walk() {

        System.out.println("Walks on 4 legs.");
    }

    public void herbivore() {

        System.out.println("Herbivore.");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walk();
        horse.herbivore();
        System.out.println(horse.eyes);
    }
}
