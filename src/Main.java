public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("\n Первое задание:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.printf(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("\n Второе задание:");
        int friday = 2;
        for (int i = 0; i + friday <= 31; i += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", i + friday);
        }
    }

    public static void task3() {
        System.out.println("\n Третье задание:");
        int year = 2022;
        for (int i = 0; i <= year + 200; i += 79) {
            if (i > year - 200 && i < year + 100) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        System.out.println("\n Четвёртое задание:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":\tping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ":\tping");
            } else if (i % 5 == 0) {
                System.out.println(i + ":\tpong");
            } else {
                System.out.println(i + ":\t");
            }
        }
    }

    public static void task5() {
        System.out.println("\n Четвёртое задание:");
        int first = 0;
        int second = 1;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(second + " ");
                first = first + second;
            } else {
                System.out.print(first + " ");
                second = first + second;
            }
        }
    }
}