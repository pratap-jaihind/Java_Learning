public class Demo {
    int x ;
    int y ; 
    int z ;

    // Constructor
    Demo() {
        System.out.println("Constructor called");
    }

    Demo(int a) {
        x = a;
        System.out.println("Constructor with one parameter called");
    }
    Demo(int a, int b) {
        x = a;
        y = b;
        System.out.println("Constructor with two parameters called");
    }

    // Parameterized constructor
    Demo(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
        System.out.println("Parameterized constructor called");
    }
}

public class Construct {
    public static void main(String[] args) {
        Demo demo = new Demo();  
        demo.x = 10;
        demo.y = 20;
        demo.z = 30;

        System.out.println("Value of x: " + demo.x);
        System.out.println("Value of y: " + demo.y);
        System.out.println("Value of z: " + demo.z);
    }
}