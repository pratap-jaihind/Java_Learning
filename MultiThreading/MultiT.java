class Process1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Process 1: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Process 1 interrupted");
            }
        }
    }
}
class Process2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Process 2: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Process 2 interrupted");
            }
        }
    }
}



class MultiT {
    public static void main(String[] args){
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(p2);
        thread1.start(); // Start Process 1
        thread2.start(); // Start Process 2
    }
}