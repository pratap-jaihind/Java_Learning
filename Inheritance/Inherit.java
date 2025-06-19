class Animal {
    // Method in the superclass
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    // Method in the subclass
    void bark() {
        System.out.println("Dog is barking");
    }
}



class Inherit {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog dog = new Dog();
        
        // Call methods from the subclass and superclass
        dog.bark(); // Method from Dog class
        dog.eat();  // Method from Animal class
    }
}