package mergeSort;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SorterTest {

    @Test
    void testMergeSort() throws ExecutionException, InterruptedException {
        List<Integer> unsorted = List.of(7, 3, 2, 16, 24, 4, 11, 9);
        List<Integer> expected = List.of(2, 3, 4, 7, 9, 11, 16, 24);

        ExecutorService ex = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(unsorted, ex);
        Future<List<Integer>> future = ex.submit(sorter);

        List<Integer> actual = future.get();
        assertEquals(expected, actual, "The array should be sorted correctly");
        
        ex.shutdown();
    }
}
