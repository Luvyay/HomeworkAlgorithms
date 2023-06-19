package lesson2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = { 6, 4, 7, 1, 9, -2 };

        quickSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    public static void quickSortRecursive(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] < pivot)
                leftMarker++;
            while (array[rightMarker] > pivot)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder)
            quickSortRecursive(array, leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            quickSortRecursive(array, leftBorder, rightMarker);
    }
}
