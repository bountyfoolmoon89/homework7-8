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
    }
    public static void task1(){
        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void task2(){
        int i;
        for (i = 10; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void task3(){
        int i;
        for (i = 0; i < 17; i+=2){
            System.out.println(i);
        }
    }
    public static void task4(){
        int i;
        for (i = 10; i >= -10; i--){
            System.out.println(i);
        }
    }
}