package Week10.LectureCode.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args){
        //Create ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        //Obtain an iterator for the ArrayList
        //fruits.iterator() creates an iterator for the collection named 'fruits'.
        //This iterator is an object that allows you to traverse through the elements of the collection one by one.

        //iterator.hasNext() checks if there's another element in the collection.
        // The loop continues as long as there are more elements.

        //iterator.next() retrieves the next element in the iteration.
        Iterator<String> iterator = fruits.iterator();

        //Iterate over the elements using the iterator
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
