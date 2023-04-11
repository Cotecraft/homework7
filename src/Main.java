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
            System.out.print (counting +" ");
            counting = counting + 1;
        }

        System.out.println();

        int countingA = 10;
        while (countingA >= 0) {
            System.out.print (countingA +" ");
            countingA = countingA - 1;
        }

        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 0;
        for (int i = 0; year <= 9; i = i + 1 ){
            year = year + 1;
            birthRate = 17 * year;
            mortality = 8 * year;
            population = 12_000_000 + birthRate - mortality;
            System.out.println("Год " + year + " Население " + population);
        }

        System.out.println("Задание 4-5");

        int income= 15000;
        int bank = 0;
        int i = 0;
        for (; bank <= 12_000_000; i++) {
            bank = bank + bank/100 * 7;
            bank = bank + income;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + bank);
            }
        }

        System.out.println("Задание 7");

        int friday = 1;
        int month 31;
        for
        }
    }
}