interface MyInterface {
    void displayMessage();
}

// We are making  so we need to use `implements` keyword to implement the interface
// But if we make another interface from an another interface, we can use `extends` keyword
class MyClass implements MyInterface {  
    // Implementing the method from the interface
    // This is called overriding
    public void displayMessage() {
        System.out.println("Hello from MyClass implementing MyInterface!");
    }
}



class InterF {
    public static void main(String[] args) {
        // Create an instance of the class that implements the interface
        MyClass myClass = new MyClass();
        
        // Call the method defined in the interface
        myClass.displayMessage();
    }
}