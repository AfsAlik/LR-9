package LR13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Ex6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = findSum(array);
        System.out.println("Сумма: " + sum);
    }

    public static int findSum(int[] array) throws InterruptedException, ExecutionException {
        int numberOfThreads = Math.min(array.length, Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<Integer>> futureResults = new ArrayList<>();

        int blockSize = (int) Math.ceil((double) array.length / numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            int startIndex = i * blockSize;
            int endIndex = Math.min(array.length, (i + 1) * blockSize);
            futureResults.add(executorService.submit(new SumFinder(Arrays.copyOfRange(array, startIndex, endIndex))));
        }

        executorService.shutdown();

        return futureResults.stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    return 0;
                })
                .mapToInt(Integer::intValue)
                .sum();
    }

    static class SumFinder implements Callable<Integer> {
        private final int[] array;

        public SumFinder(int[] array) {
            this.array = array;
        }

        @Override
        public Integer call() {
            return Arrays.stream(array).sum();
        }
    }
}
