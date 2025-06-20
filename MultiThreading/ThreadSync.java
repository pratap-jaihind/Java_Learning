import java.util.Scanner;


class Account{
    int balance ;
    public Account(int balance) {
        this.balance = balance;
    }
    boolean isSufficient(int amount) {
        if (amount <= balance) {
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
            return false;
        }
    }

    void withdraw(int amount) {
        if (isSufficient(amount)) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
        }
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
    int getBalance() {
        return balance;
    }
}

class Customer implements Runnable{
    Account account;
    public Customer(Account account) {
        this.account = account;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        synchronized (account) {
        System.out.println("Enter amount to withdraw:");
        int amount = scanner.nextInt();
        if(account.isSufficient(amount)) {
            account.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed due to insufficient funds.");
        }
        }
        
    }
}



class ThreadSync {
    public static void main(String[] args) {
        Account account = new Account (5000);
        Customer customer = new Customer(account);
        Thread thread1 = new Thread(customer);
        Thread thread2 = new Thread(customer);
        thread1.start(); // Start first customer thread
        thread2.start(); // Start second customer thread

    }
}