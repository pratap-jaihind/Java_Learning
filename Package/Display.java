package Package1;
public class Display{
    int x ;
    int y ;
    public void take(int a , int b){
         x = a;
         y = b;
    }

    public void show(){
        System.out.println("Sum of x and y is: " + (x + y));
    }
}