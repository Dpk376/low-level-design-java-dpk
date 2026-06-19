package UrlScrapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Client demonstrating parallel execution of URL scraping tasks.
 */
public class Client {

    /**
     * Main method comparing FixedThreadPool and CachedThreadPool performance.
     *
     * @param args command-line arguments
     * @throws ExecutionException if a task throws an exception
     * @throws InterruptedException if the current thread is interrupted
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> urls = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            urls.add("http://example.com/page" + i);
        }

        // FixedThreadPool(10)
        ExecutorService fixedPool = Executors.newFixedThreadPool(10);
        long fixedTime = executeTasks(urls, fixedPool);
        System.out.println("FixedThreadPool Time: " + fixedTime + " ms");

        // CachedThreadPool
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        long cachedTime = executeTasks(urls, cachedPool);
        System.out.println("CachedThreadPool Time: " + cachedTime + " ms");
    }

    /**
     * Submits scraping tasks to the given executor and waits for completion.
     *
     * @param urls the list of URLs to process
     * @param executorService the executor to handle tasks
     * @return the execution time in milliseconds
     * @throws ExecutionException if a task throws an exception
     * @throws InterruptedException if the current thread is interrupted
     */
    private static long executeTasks(List<String> urls,
                                     ExecutorService executorService) throws ExecutionException, InterruptedException {
        List<Future<Void>> futures = new ArrayList<>();

        long start = System.currentTimeMillis();

        // Submit tasks
        for (String url : urls) {
            futures.add(executorService.submit(new ScrapURL(url)));
        }

        // Wait for all tasks
        for (Future<Void> future : futures) {
            future.get();
        }

        long end = System.currentTimeMillis();

        executorService.shutdown();

        return end - start;
    }
}
