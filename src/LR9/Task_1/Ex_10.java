package LR9.Task_1;

public class Ex_10 {

    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                return 20;
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }


}