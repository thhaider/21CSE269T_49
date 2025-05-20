// Parent class
//Runtime Polymorphism 
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;   // Reference of parent class

        a = new Dog();   // Object of Dog
        a.sound();       // Outputs: Dog barks

        a = new Cat();   // Object of Cat
        a.sound();       // Outputs: Cat meows
    }
}
