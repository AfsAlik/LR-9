package LR11.Number3;

public class LinkedList {
    private Node head;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Ввод с головы
    public void createHead(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            addFirst(values[i]);
        }
    }

    // Ввод с хвоста
    public void createTail(int[] values) {
        for (int value : values) {
            addLast(value);
        }
    }

    // Вывод списка
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

    // Добавление элемента в начало списка
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Добавление элемента в конец списка
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Вставка элемента в список с указанным номером
    public void insert(int value, int position) {
        if (position == 0) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head;
        for (int i = 1; i < position; i++) {
            if (current.next == null) {
                throw new IllegalArgumentException("За пределами допустимого");
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Удаление элемента с головы списка
    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        head = head.next;
    }

    // Удаление последнего элемента списка
    public void removeLast() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Удаление из списка элемента с указанным номером
    public void remove(int position) {
        if (position == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        for (int i = 1; i < position; i++) {
            if (current.next == null || current.next.next == null) {
                throw new IllegalArgumentException("За пределами допустимого");
            }
            current = current.next;
        }
        current.next = current.next.next;
    }

    // Ввод с головы (рекурсия)
    public void createHeadRec(int[] values) {
        createHeadRecHelper(values, values.length - 1);
    }
    private void createHeadRecHelper(int[] values, int index) {
        if (index < 0) {
            return;
        }
        createHeadRecHelper(values, index - 1);
        addFirst(values[index]);
    }

    // Ввод с хвоста (рекурсия)
    public void createTailRec(int[] values) {
        createTailRecHelper(values, 0);
    }

    private void createTailRecHelper(int[] values, int index) {
        if (index >= values.length) {
            return;
        }
        addLast(values[index]);
        createTailRecHelper(values, index + 1);
    }

    // Вывод списка (рекурсия)
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "";
        }
        return node.value + " " + toStringRecHelper(node.next);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] values = {1, 2, 3, 4, 5};

        // Создаем список с использованием цикла
        list.createHead(values);
        System.out.println("Список после createHead: " + list);

        list = new LinkedList();
        list.createTail(values);
        System.out.println("Список после createTail: " + list);

        // Добавление элементов
        list.addFirst(0);
        System.out.println("Список после addFirst: " + list);

        list.addLast(6);
        System.out.println("Список после addLast: " + list);

        list.insert(100, 3);
        System.out.println("Список после insert: " + list);

        // Удаление элементов
        list.removeFirst();
        System.out.println("Список после removeFirst: " + list);

        list.removeLast();
        System.out.println("Список после removeLast: " + list);

        list.remove(2);
        System.out.println("Список после remove: " + list);

        // Создаем список с использованием рекурсии
        list = new LinkedList();
        list.createHeadRec(values);
        System.out.println("Список после createHeadRec: " + list);

        list = new LinkedList();
        list.createTailRec(values);
        System.out.println("Список после createTailRec: " + list);

        System.out.println("Рекурсивный вывод списка: " + list.toStringRec());
    }
}
