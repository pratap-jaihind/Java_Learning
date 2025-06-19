class Process1 extends Thread {
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
class Process2 extends Thread {
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
class MultiT2 {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        p1.start(); // Start Process 1
        p2.start(); // Start Process 2
    }
}