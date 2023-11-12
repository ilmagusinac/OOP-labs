package lab6.LibraryInformationSystem;
import java.util.ArrayList;

public class Library extends StringUtils {
    ArrayList<Book> library = new ArrayList<>();

    public Library() {

    }

    public void addBook(Book newBook) {
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book b : this.library) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : this.library) {
            if (Library.included(b.title(), title)) {
                found.add(b);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : this.library) {
            if (Library.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : this.library) {
            if (b.year() == year) {
                found.add(b);
            }
        }

        return found;
    }
}