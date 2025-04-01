import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumNaturalNumbers implements Callable<Integer> {
    private int n;

    public SumNaturalNumbers(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

public class CallableNaturalSum {
    public static void main(String[] args) {
        int n = 10;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumNaturalNumbers(n));

        try {
            System.out.println("Sum of first " + n + " natural numbers: " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
