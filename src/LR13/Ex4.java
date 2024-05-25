package LR13;

public class Ex4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            new Thread(() -> System.out.println("Thread number: " + threadNumber)).start();
        }
    }
}
