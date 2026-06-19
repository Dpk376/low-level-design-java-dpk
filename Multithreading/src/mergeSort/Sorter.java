package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Callable task for multithreaded MergeSort.
 * Divides the list into two halves and recursively submits sorting tasks to the executor service.
 */
public class Sorter implements Callable<List<Integer>> {

    private final List<Integer> arrayToSort;
    private final ExecutorService executorService;

    /**
     * Constructs a Sorter task.
     *
     * @param arrayToSort the list of integers to sort
     * @param executorService the thread pool used for recursive sorting tasks
     */
    public Sorter(List<Integer> arrayToSort,
                  ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    /**
     * Executes the split and sort process.
     *
     * @return the sorted list
     * @throws Exception if interrupted or execution fails
     */
    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;
        List<Integer> left = arrayToSort.subList(0, mid);
        List<Integer> right = arrayToSort.subList(mid, arrayToSort.size());

        Sorter leftSorter = new Sorter(left, executorService);
        Sorter rightSorter = new Sorter(right, executorService);
        
        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        List<Integer> sortedLeft = leftFuture.get();
        List<Integer> sortedRight = rightFuture.get();

        return merge(sortedLeft, sortedRight);
    }

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left the first sorted list
     * @param right the second sorted list
     * @return the merged sorted list
     */
    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i++));
        }
        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }
}
