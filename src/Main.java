import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1: Нормированное расстояние (Блочная сортировка)");
        double[] test1_1 = {0.42, 0.11, 0.87, 0.35};
        System.out.println("Тест 1. Вход:     " + Arrays.toString(test1_1));
        System.out.println("        Результат: " + Arrays.toString(Sorting.bucketSort(test1_1)));

        double[] test1_2 = {0.01, 0.99, 0.50};
        System.out.println("Тест 2. Вход:     " + Arrays.toString(test1_2));
        System.out.println("        Результат: " + Arrays.toString(Sorting.bucketSort(test1_2)));

        System.out.println("\nЗадача 2: Коды заказов (Поразрядная сортировка LSD)");
        int[] test2_1 = {314159, 271828, 123456};
        System.out.println("Тест 1. Вход:     " + Arrays.toString(test2_1));
        System.out.println("        Результат: " + Arrays.toString(Sorting.radixSort(test2_1)));

        int[] test2_2 = {90, 9, 900};
        System.out.println("Тест 2. Вход:     " + Arrays.toString(test2_2));
        System.out.println("        Результат: " + Arrays.toString(Sorting.radixSort(test2_2)));

        System.out.println("\nЗадача 3: Биты доступа (Сортировка подсчетом)");
        int[] test3_1 = {3, 0, 2, 3, 1};
        System.out.println("Тест 1. Вход:     " + Arrays.toString(test3_1));
        System.out.println("        Результат: " + Arrays.toString(Sorting.countingSort(test3_1)));

        int[] test3_2 = {2, 2, 0, 3};
        System.out.println("Тест 2. Вход:     " + Arrays.toString(test3_2));
        System.out.println("        Результат: " + Arrays.toString(Sorting.countingSort(test3_2)));
    }
}
