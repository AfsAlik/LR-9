package LR11.Number5;

import java.util.*;

public class LinkedLists {
    public static void main(String args[]) {
        int index = 0;
        int n = 1000000;
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //Добавление
        for (int i = 1; i <= n; i++){
            ll.add(index, i);
            index++;
        }
        System.out.println("Array:" + ll);

        //Добавление по идексу
        ll.add(500000, 1);

        //Изменение
        ll.set(999999, 777);
        ll.set(0, 666);
        System.out.println("Array(после изменения):" + ll);

        //Удаление
        ll.remove(2);
        ll.remove(7);
        System.out.println("Array(после удаления):" + ll);

        //Преобразование в массив
        Object[] a = ll.toArray();
        System.out.print("После преобразования LinkedList в массив: ");
        for(Object element : a)
            System.out.print(element+" ");

        //Размер
        System.out.println("\nРазмер:" + ll.size());

        //Удаление головы
        System.out.println("Удаление головы: " + ll.removeFirst());

        //Удаление хвоста
        System.out.println("Удаление головы: " + ll.removeLast());
    }
}
