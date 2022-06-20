package by.itAcademy.Miholenko;

public class RealArray {

    public static void main(String[] args) {
        int[] newArray = RandomArray.createNewRandomArray(100);
        RandomArray.printArray(newArray);
        RandomArray.printPositiveOddNumbersCount(newArray);
    }
}
