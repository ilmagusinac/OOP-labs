package lab6;

import java.util.Arrays;
public class Exercise1 {
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] value = { 1,5,0,4 };
        System.out.println("Smallest: " + smallest(value) );


    }

}
