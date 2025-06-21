import java.io.*;

class FileH1 {
    public static void main(String[] args) {
        // try {
        //     File file = new File("example.txt");
        //     if (file.createNewFile()) {
        //         System.out.println("File created: " + file.getName());
        //     } else {
        //         System.out.println("File already exists.");
        //     }
        // } catch (IOException e) {
        //     System.out.println("An error occurred while creating the file.");
        //     e.printStackTrace();
        // }
        String s1 = "Hello, this is a second test file \n";
        
        try {
            FileOutputStream fos = new FileOutputStream("example.txt" , true);
            fos.write(s1.getBytes());
            System.out.println("Data written to file successfully.");
             fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } 
    }
}