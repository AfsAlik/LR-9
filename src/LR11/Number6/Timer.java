package LR11.Number6;

import java.util.*;

public class Timer {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();

        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTime1(arrayDeque));
        System.out.println("Время выполнения операции добавления TreeSet = " + getRunningTime2(linkedlist));
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime2(arrayList));

    }

    private static long getRunningTime1(ArrayDeque<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime2(List<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
