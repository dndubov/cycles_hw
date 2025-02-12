public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 2
        System.out.println("Задача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 4
        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 5
        System.out.println("Задача 5:");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();

        // Задача 6
        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 7
        System.out.println("Задача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 8
        System.out.println("Задача 8:");
        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();

        // Задача 9
        System.out.println("Задача 9:");
        double bankSavings = 0;
        for (int month = 1; month <= 12; month++) {
            bankSavings += 29000;
            bankSavings *= 1.01; // Добавляем 1% к сумме
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) bankSavings + " рублей");
        }
        System.out.println();

        // Задача 10
        System.out.println("Задача 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
