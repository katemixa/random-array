package by.itAcademy.Miholenko;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        int counter = 0;
        for (int j : array) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println("Количество положительных нечетных чисел в этом массиве равно " + counter);
    }
}
