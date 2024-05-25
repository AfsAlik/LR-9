package LR11.Number5;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        int n = 1000000;
        int index = 0;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        //Добавление
        for (int i = 1; i <= n; i++) {
            arr1.add(index, i);
            index++;
        }

        //Добавление по индексу
        arr1.add(999999, 777);
        arr1.add(999995, 666);
        System.out.println("Array:" + arr1);

        //Удаление по индексу
        arr1.remove(2);
        System.out.println("Array: " + arr1);

        //Поиск
        Integer s = arr1.get(2);
        System.out.println("Поиск по индексу:" + s);

        //Сортировка
        Collections.sort(arr1);
        System.out.println("Array(после сортировки):" + arr1);

        //Размер
        Integer r = arr1.size();
        System.out.println("Размер:" + r);

        System.out.println("Array:" + arr1);

    }
}
