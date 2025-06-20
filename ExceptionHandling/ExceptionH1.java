class ExceptionH1{
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } 
        finally {
            System.out.println("This block always executes, regardless of an exception.");
        }
    }
}