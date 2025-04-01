import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class MaxTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start, end;

    public MaxTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) { // Small enough to process directly
            int max = arr[start];
            for (int i = start + 1; i < end; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }

        int mid = (start + end) / 2;
        MaxTask leftTask = new MaxTask(arr, start, mid);
        MaxTask rightTask = new MaxTask(arr, mid, end);

        leftTask.fork();  // Start left task in parallel
        int rightMax = rightTask.compute(); // Compute right task directly
        int leftMax = leftTask.join(); // Wait for left task

        return Math.max(leftMax, rightMax);
    }
}

public class ForkJoinMax {
    public static void main(String[] args) {
        int[] arr = {3, 10, 45, 2, 67, 99, 23, 89, 12, 78};

        ForkJoinPool pool = new ForkJoinPool();
        int max = pool.invoke(new MaxTask(arr, 0, arr.length));

        System.out.println("Max Value: " + max);
    }
}


