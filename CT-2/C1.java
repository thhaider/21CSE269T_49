//Multithreading using wait() and notify()

class Task {
    private boolean isCompleted = false;

    public synchronized void produce() {
        System.out.println("Producer: Task started...");
        try {
            Thread.sleep(2000); // Simulate work
        } catch (InterruptedException e) {}

        isCompleted = true;
        System.out.println("Producer: Task completed, notifying consumer.");
        notify(); // Notify waiting consumer
    }

    public synchronized void consume() {
        System.out.println("Consumer: Waiting for task...");
        while (!isCompleted) {
            try {
                wait(); // Wait until task is completed
            } catch (InterruptedException e) {}
        }
        System.out.println("Consumer: Got notification, proceeding with next step.");
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        Task task = new Task();

        Thread producer = new Thread(() -> task.produce());
        Thread consumer = new Thread(() -> task.consume());

        consumer.start();
        producer.start();
    }
}
