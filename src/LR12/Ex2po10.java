package LR12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex2po10 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        List<String> strings = Arrays.asList("Apple", "banana", "Cherry", "date", "Fig");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("2. Общие элементы: " + Arrays.toString(commonElements(array1, array2)));
        System.out.println("3. Строки, начинающиеся с заглавной буквы: " + filterStringsStartingWithCapital(strings));
        System.out.println("4. Квадраты чисел: " + getSquares(numbers));
        System.out.println("5. Строки, содержащие подстроку 'an': " + filterStringsContaining(strings, "an"));
        System.out.println("6. Числа, делящиеся на 2: " + filterNumbersDivisibleBy(numbers, 2));
        System.out.println("7. Строки длиннее 4: " + filterStringsLongerThan(strings, 4));
        System.out.println("8. Числа больше 3: " + filterNumbersGreaterThan(numbers, 3));
        System.out.println("9. Строки, содержащие только буквы: " + filterStringsContainingOnlyLetters(strings));
        System.out.println("10. Числа меньше 4: " + filterNumbersLessThan(numbers, 4));
    }

    public static int[] commonElements(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .distinct()
                .toArray();
    }

    public static List<String> filterStringsStartingWithCapital(List<String> strings) {
        return strings.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsContaining(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersDivisibleBy(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsLongerThan(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int minValue) {
        return numbers.stream()
                .filter(n -> n > minValue)
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsContainingOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int maxValue) {
        return numbers.stream()
                .filter(n -> n < maxValue)
                .collect(Collectors.toList());
    }
}
