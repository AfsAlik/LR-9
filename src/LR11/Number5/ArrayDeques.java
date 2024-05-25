package LR11.Number5;

import java.util.*;

public class ArrayDeques {
    public static void main(String[] args){
        ArrayDeque<Integer> deq_ue = new ArrayDeque<Integer>();

        //Добавление
        for (int i = 1; i <= 1000000; i++);{
            deq_ue.add(1);
        }

        //Итерация
        for (Integer element : deq_ue) {
            System.out.println("Элемент :" + element);
        }

        //Добавление в начало
        deq_ue.addFirst(564);
        deq_ue.addFirst(465);

        //Добавление в конец
        deq_ue.addLast(24);
        deq_ue.addLast(42);

        System.out.println("\nПоиск головы: " + deq_ue.getFirst());
        System.out.println("Поиск хвоста: " + deq_ue.getLast());

        Object[] arr1 = deq_ue.toArray();
        System.out.println("\nРазмер списка : " + arr1.length);
        System.out.print("Элементы списка : ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(" " + arr1[i]);
        }

        System.out.println("\n\nУдаление головы : " + deq_ue.removeFirst());
        System.out.println("Удаление хвоста : " + deq_ue.removeLast());

        System.out.println("\nОкончательный список: " + deq_ue);
    }
}
