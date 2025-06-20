import java.io.IOException;

class ExceptionH2 {
    public static void main(String[] args) throws IOException { 
        System.out.println("This is the main method.");
        throw new IOException("This is an IOException thrown from the main method.");
    }
}