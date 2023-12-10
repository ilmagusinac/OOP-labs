package Week10.LectureCode.iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
class GenericIterator<T> implements Iterator<T> {
    private List<T> elements;
    private int currentIndex;

    public GenericIterator(List<T> elements){
        this.elements=elements;
    }

    @Override
    public boolean hasNext(){
        return currentIndex<elements.size(); //true or false based on the currentIndex
    }

    @Override
    public T next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return elements.get(currentIndex++);
    }
}

class MainGenericIterator{
    public static void main(String[] args){
        //Arrays.asList() method in Java is a convenient way to create a fixed-size list backed by an array
        List<Movie> movies = Arrays.asList(
                new Movie("Ljeto u zlatnoj dolini", "Ilma", 10),
                new Movie("Kod amidze Idriza", "Ilma", 10),
                new Movie("Zaba", "Ilma", 7)
        );

        GenericIterator movieIterator = new GenericIterator(movies);
        int count = 0;
        while(movieIterator.hasNext()){
            System.out.println(movieIterator.next());
            count++;
        }
    }
}
