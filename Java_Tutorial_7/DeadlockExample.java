class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 locked lock1");
                synchronized (lock2) {
                    System.out.println("Thread 1 locked lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock1) {  // Fix: Lock in same order
                System.out.println("Thread 2 locked lock1");
                synchronized (lock2) {
                    System.out.println("Thread 2 locked lock2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

