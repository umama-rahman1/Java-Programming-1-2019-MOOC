
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Smallest index : " + MainProgram.smallest(array));
        System.out.println("Index of smallest:" + MainProgram.indexOfSmallest(array));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 3));
        //MainProgram.swap(array,5,4);
        //System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int index = 69;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int j = 0;
       // while (j <= array.length) {
            //swap(array,indexOfSmallest(array),0);
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array));
                swap(array, indexOfSmallestFrom(array, i), i);
            }
            System.out.println(Arrays.toString(array));
           // j++;
       // }

    }
}
