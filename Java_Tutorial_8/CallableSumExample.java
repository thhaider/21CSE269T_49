import java.util.concurrent.*;

class SumTask implements Callable<Integer> {
    private int a, b;
    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Integer call() {
        return a + b;
    }
}

public class CallableSumExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumTask(10, 20));

        System.out.println("Sum: " + future.get()); // Retrieve result
        executor.shutdown();
    }
}
