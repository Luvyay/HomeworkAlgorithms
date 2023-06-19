package lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = { 6, 4, 7, 1, 9, -2 };

        heapsort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void heapsort(int[] array)
    {
        int n = array.length;

        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(array, i--, n);
        }

        while (n > 0)
        {
            array[n - 1] = pop(array, n);
            n--;
        }
    }

    private static void heapify(int[] array, int i, int size)
    {
        int left = LEFT(i);
        int right = RIGHT(i);

        int largest = i;

        if (left < size && array[left] > array[i]) {
            largest = left;
        }

        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i)
        {
            swap(array, i, largest);
            heapify(array, largest, size);
        }
    }

    public static int pop(int[] array, int size)
    {
        if (size <= 0) {
            return -1;
        }

        int top = array[0];

        array[0] = array[size-1];

        heapify(array, 0, size - 1);

        return top;
    }

    private static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int LEFT(int i) {
        return (2*i + 1);
    }

    private static int RIGHT(int i) {
        return (2*i + 2);
    }
}
