package by.itAcademy.Miholenko;

import java.util.Random;

public class RandomArray {

    public static int[] createNewRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void printPositiveOddNumbersCount(int[] array){
        System.out.println();
        int counter = 0;
        for (int j : array) {
            if (j % 2 == 1) {
                counter++;
            }
        }
        System.out.println("Количество положительных нечетных чисел в этом массиве равно " + counter);
    }
}
