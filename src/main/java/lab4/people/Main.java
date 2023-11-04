package lab4.people;
import java.util.List;
import java.util.ArrayList;

public class Main {
 /*
    //1-a)
    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
    }

     */

    /*
    //1-b)

    public static void main(String[] args){
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());
    }
     */

    /*
    //1-c)
    public static void main(String[] args){
        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekka);
        System.out.println(esko);

        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for(int i=0; i<25; i++){
            olli.study();
        }
        System.out.println(olli);
    }
    */

    /*
    //1-d)
    public static void printDepartment(List<Person> people){
        //we print all the people in the department
        for(Person person: people){
            System.out.println(person);

        }

    }

    public static void main(String[] args){
        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));
        printDepartment(people);
    }
     */
    /*
    //3
    public static void main(String[] args){
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vanta");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki");

        pekka.setAge(30);
        pekka.setCountry("Finland");
        System.out.println("Age: " + pekka.getAge());
        System.out.println("Country: " + pekka.getCountry());

        esko.setAge(25);
        esko.setCountry("Finland");

        System.out.println("Age: " + esko.getAge());
        System.out.println("Country: " + esko.getCountry());
    }
     */
/*
    //4
    public static void main(String[] args){
        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        olli.setStudentId("12345");
        olli.addGrade(85.5);
        olli.addGrade(95.0);
        System.out.println("id: " + olli.getStudentId());
        System.out.println("grades: " + olli.getGrades());
    }*/
}
