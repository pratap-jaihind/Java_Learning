class MyName {
    String name = "John Doe";
    private int age = 30;
}


public class HelloWorld {
    void function() {
        System.out.println("This is a function in the HelloWorld class.");
    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        MyName myName = new MyName();
        System.out.println("My name is: " + myName.name);
        System.out.println("My age is: " + myName.age);
        System.out.println("This is a simple Java program.");
    }
}
