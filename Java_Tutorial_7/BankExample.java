import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 100;
    private final ReentrantLock lock = new ReentrantLock();

    public void deposit(int amount) {
        lock.lock();  // Locking before updating balance
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
        } finally {
            lock.unlock();  // Unlocking after updating balance
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(10);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
