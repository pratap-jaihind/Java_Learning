import java.io.IOException;

class ExceptionH2 {
    // public static void main(String[] args) throws IOException { 
    //     System.out.println("This is the main method.");
    //     throw new IOException("This is an IOException thrown from the main method.");
    // }
    public static void main(String[] args){
       try{
         throw new IOException("This is an IOException thrown from the main method.");
       }
       catch(IOException e){
           System.out.println("Caught an IOException: " + e.getMessage());
       }
       catch(Exception e){
           System.out.println("Caught a general exception: " + e.getMessage());
       }
       finally{
           System.out.println("This block always executes, regardless of an exception.");

       }

    }
}