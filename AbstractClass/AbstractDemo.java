abstract class AbstractClass {
    // Abstract method
    abstract void display();

    // Concrete method
    void show() {
        System.out.println("This is a concrete method in the abstract class.");
    }
}
class ConcreteClass extends AbstractClass {
    // Implementing the abstract method

    void display() {
        System.out.println("Display method implemented in ConcreteClass.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        ConcreteClass obj = new ConcreteClass();
        
        // Call the implemented abstract method
        obj.display();
        
        // Call the concrete method from the abstract class
        obj.show();
    }
}