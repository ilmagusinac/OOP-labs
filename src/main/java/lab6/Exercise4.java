package lab6;
import java.util.Arrays;
public class Exercise4 {
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] values2 = { 3, 2, 5, 4, 8 };

        System.out.println(Arrays.toString(values2));
        swap(values2, 1, 0);
        System.out.println(Arrays.toString(values2));
        swap(values2, 0, 3);
        System.out.println(Arrays.toString(values2));

    }
}
