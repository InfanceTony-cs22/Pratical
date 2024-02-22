class Animal {
    String sound = "Animal Sound";

    void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    String sound = "Bark";

    void makeDogSound() {
        System.out.println(sound);
    }

    void displayAnimalSound() {
        super.makeSound(); // using 'super' to call the method from the superclass
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeDogSound(); // Outputs: Bark
        myDog.displayAnimalSound(); // Outputs: Animal Sound
    }
}
