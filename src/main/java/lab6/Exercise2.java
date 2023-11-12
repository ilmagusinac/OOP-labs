package lab6;

public class Exercise2 {
    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] value = { 1,5,0,4 };
        System.out.println("Index of the smallest: "  + indexOfTheSmallest(value));


    }

}

