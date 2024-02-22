class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Multilevel Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Hybrid Inheritance
interface Swimmer {
    void swim();
}

class Dolphin extends Animal implements Swimmer {
    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}

class HybridInheritanceDemo {
    public static void main(String[] args) {
        // Simple Inheritance
        Animal animal = new Animal();
        animal.eat();

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();

        // Hybrid Inheritance
        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.swim();
    }
}
