package people;
import java.util.List;
import java.util.ArrayList;
/*
d) Implement the method public static void printDepartment(List<Person> people) in the
Main class, default package. The method prints all the people in the parameter list.
When the main method is called, printDepartment should work in the following way.
public static void printDepartment(List<Person> people) {
// we print all the people in the department
}
public static void main(String[] args) {
List<Person> people = new ArrayList<Person>();
people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa",
1200) );
people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
printDepartment(people);
}

*/
public class Main {

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));
        printDepartment(people);
    }

}
