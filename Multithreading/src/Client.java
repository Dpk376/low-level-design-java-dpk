import mergeSort.Sorter;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Main client demonstrating multithreaded MergeSort.
 */
public class Client {

    /**
     * Main method.
     *
     * @param args command-line arguments
     * @throws ExecutionException if execution fails
     * @throws InterruptedException if interrupted
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(2, 3, 1, 4, 2, 6);
        // Using ForkJoinPool for recursive divide-and-conquer workloads
        ExecutorService ex = java.util.concurrent.ForkJoinPool.commonPool();

        try {
            Sorter sorter = new Sorter(arr, ex);
            Future<List<Integer>> future = ex.submit(sorter);

            System.out.println("Sorted Array: " + future.get());
        } finally {
            // commonPool() doesn't strictly require shutdown, but demonstrating safe lifecycle
            // if it were a custom thread pool.
            if (ex != java.util.concurrent.ForkJoinPool.commonPool()) {
                ex.shutdown();
            }
        }
    }
}
