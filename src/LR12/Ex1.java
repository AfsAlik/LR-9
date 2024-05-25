package LR12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] evenArray = filterEvenNumbers(inputArray);

        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        System.out.println("Массив с четными числами: " + Arrays.toString(evenArray));
    }

    public static int[] filterEvenNumbers(int[] inputArray) {
        return IntStream.of(inputArray)
                .filter(number -> number % 2 == 0)
                .toArray();
    }
}
