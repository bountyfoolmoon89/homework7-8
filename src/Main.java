public class Main {
    public static void main(String[] args) {
        System.out.println(" Task 1");
        task1();
        System.out.println(" Task 2");
        task2();
        System.out.println(" Task 3");
        task3();
        System.out.println(" Task 4");
        task4();
        System.out.println(" Task 5");
        task5();
        System.out.println(" Task 6");
        task6();
        System.out.println(" Task 7");
        task7();
    }

    public static void task1() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        int i;
        for (i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        int i;
        for (i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        int i;
        for (i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        int i;
        for (i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        int i;
        for (i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }
    public static void task7(){
        int i;
        for (i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }
}