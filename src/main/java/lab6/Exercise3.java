package lab6;

public class Exercise3 {
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestindex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestindex = i;
            }
        }
        return smallestindex;
    }

    public static void main(String[] args) {
        int[] value = { -1,6,9,8,12 };
        System.out.println(indexOfTheSmallestStartingFrom(value, 1));
        System.out.println(indexOfTheSmallestStartingFrom(value, 2));
        System.out.println(indexOfTheSmallestStartingFrom(value, 4));

    }
}
