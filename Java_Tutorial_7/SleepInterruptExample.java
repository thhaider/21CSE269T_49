class SleepInterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is sleeping...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        });

        thread.start();
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        thread.interrupt();
    }
}

