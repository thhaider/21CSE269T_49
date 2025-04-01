import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

class CountEvenOddTask extends RecursiveTask<int[]> {
    private int[] arr;
    private int start, end;

    public CountEvenOddTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    protected int[] compute() {
        if (end - start <= 10) { // Base case: Small array
            int even = 0, odd = 0;
            for (int i = start; i < end; i++) {
                if (arr[i] % 2 == 0) even++;
                else odd++;
            }
            return new int[]{even, odd};
        }
        
        int mid = (start + end) / 2;
        CountEvenOddTask left = new CountEvenOddTask(arr, start, mid);
        CountEvenOddTask right = new CountEvenOddTask(arr, mid, end);

        left.fork();
        int[] rightResult = right.compute();
        int[] leftResult = left.join();

        return new int[]{leftResult[0] + rightResult[0], leftResult[1] + rightResult[1]};
    }
}

public class ForkJoinEvenOdd {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;

        ForkJoinPool pool = new ForkJoinPool();
        int[] result = pool.invoke(new CountEvenOddTask(arr, 0, arr.length));

        System.out.println("Even count: " + result[0] + ", Odd count: " + result[1]);
    }
}

