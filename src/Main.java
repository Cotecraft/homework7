public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int salary = 15_000;
        int total = 0;
        int a = 0;
        for (a = 0; total <= 2459000; a++) {
            total = total + salary;
            System.out.println("Месяц " + a + " Зп " + total);
        }


        System.out.println("Задание 2");

        int counting = 0;
        while (counting <= 10) {
            System.out.print(counting + " ");
            counting = counting + 1;
        }

        System.out.println();

        int countingA = 10;
        while (countingA >= 0) {
            System.out.print(countingA + " ");
            countingA = countingA - 1;
        }

        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 0;
        for (int i = 0; year <= 9; i = i + 1) {
            year = year + 1;
            birthRate = population / 1000 * 17;
            mortality = population / 1000 * 8;
            population = population + birthRate - mortality;
            System.out.println("Год " + year + " Население " + population);
        }

        System.out.println("Задание 4-6");

        int income = 15000;
        int bank = 0;
        int i = 0;
        int month = 1;
        for (; month <= 108; month++) {
            bank = bank + bank / 100 * 7;
            bank = bank + income;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + bank);
            }
        }

        System.out.println("Задание 7");

        int friday = 3;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println(friday + ", Пятница, готовь отчет");
        }


        System.out.println("Задание 8");

        int cometYear = 79;
        int currentYear = 2023;
        int past200Years = 1823;
        int next100Years = 2123;
        for (i = 1823; i < 2123; i++) {
            if (i % cometYear == 0) {
                System.out.println(i);
            }
        }
    }
}
