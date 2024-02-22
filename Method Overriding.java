class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method in the subclass
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();

        // Calls the makeSound method of the Animal class
        genericAnimal.makeSound();

        // Calls the overridden makeSound method of the Dog class
        dog.makeSound();
    }
}
