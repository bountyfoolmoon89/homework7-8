import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cycles 1.1");
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
        System.out.println(" Task 8");
        task8();
        System.out.println(" Task 9");
        task9();
        System.out.println("Cycles 1.2");
        System.out.println(" Task 10");
        task10();
        System.out.println(" Task 11");
        task11();
        System.out.println(" Task 12");
        task12();
        System.out.println(" Task 13");
        task13();
        System.out.println(" Task 14");
        task14();
        System.out.println(" Task 15");
        task15();
        System.out.println(" Task 16");
        task16();
        System.out.println(" Task 17");
        task17();
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
        int i = 1;
        while (i<17){
            i++;
            if (i%2!=0){
                continue;
            }
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
    public static void task8(){
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++){
            total = total + salary;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+total+" рублей");
        }
    }
    public static void task9(){
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++){
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+total+" рублей");
        }
    }
    public static void task10() {
        // Немного разнообразил задание
        Scanner moneys = new Scanner(System.in);
        System.out.println("Сколько вы хотите накопить?: ");
        int goal = moneys.nextInt();
        System.out.println("Сколько вы хотите откладывать?: ");
        int salary = moneys.nextInt();
        int month = 0;
        int total = 0;
        while (total < goal) {
            total = total + salary;
            month++;
            if (month > 12){
                int years = month / 12;
                int remainingMonths = month % 12;
                System.out.println(" Год "+years+" Месяц " + remainingMonths + " , сумма накоплений равна " + total + " рублей");
            } else {
                System.out.println(" Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task11(){
        int i = 0;
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (i=10; i >= 1; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task12(){
        int population = 12_000_000;
        int birthrate = 204_000; //  17 * 12.000.000 / 1000
        int deathrate = 96_000;
        int year =0;
        while (year < 10){
            year++;
            population = population + birthrate - deathrate;
            System.out.println("Год "+year+", численность населения составляет "+population);
        }
    }
    public static void task13(){
        int salary = 15_000;
        int total = 0;
        for (int month = 1; total < 12_000_000; month++) {
            total = total + total * 7 / 100;
            total = total + salary;
            if ((month > 12) && (month % 6 == 0)) {
                int years = month / 12;
                int remainingMonths = month % 12;
                System.out.println("Год " + years + " Месяц " + remainingMonths + " , сумма накоплений равна " + total + " рублей");
            } else if (month % 6 == 0){
                System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            }
        }

    }
    public static void task14() {
        int salary = 15_000;
        int total = 0;
        for (int month = 1; month <= 108; month++) {
            total = total + total * 7 / 100;
            total = total + salary;
            if ((month > 12) && (month % 6 == 0)) {
                int years = month / 12;
                int remainingMonths = month % 12;
                System.out.println("Год " + years + " Месяц " + remainingMonths + " , сумма накоплений равна " + total + " рублей ");
            } else if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task15(){
        int friday;
        for (friday = 3; friday <= 31; friday+=7){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет.");
        }
    }
    public static void task16(){
        int start;
        for (start = 1822; start <= 2122; start += 79){
            System.out.println(start);
        }
    }
    public static void task17(){
        int num1;
        int num2 = 1;
        int total = 0;
        for (num1 = 2; total < 20;){
            num2++;
            total = num1 * num2;
            System.out.println(num1 +"*"+num2+"="+total);
        }
    }
}