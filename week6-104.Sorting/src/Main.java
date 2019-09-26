import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        int b = array[index2];
        int tmp = a;
        array[index1] = b;
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        int[] values = array;
        int index = 0;
        System.out.println(Arrays.toString(values));
        for (int i  = 0; i < values.length; i++) {
            index = indexOfTheSmallestStartingFrom(values, i);
            swap(values, i, index);
            System.out.println(Arrays.toString(values));
        }
    }
}
