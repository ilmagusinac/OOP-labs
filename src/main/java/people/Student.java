package people;
import java.util.ArrayList;
import java.util.List;
/*b) Create the class Student which inherits the class Person. Students have 0 credits, at
the beginning. As long as a student studies, their credits grow. Create the class, in
relation to the following main program:


public static void main(String[] args) {
    Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
    System.out.println(olli);
    System.out.println("credits " + olli.credits());olli.study();
    System.out.println("credits "+ olli.credits());
}*/
public class Student extends Person {
    private int credits;

    private String student_id;
    private List<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
        //this.student_id=student_id;
    }
/*
    public Student(String name, String address, String student_id) {
        super(name, address);
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }
 */

    public String getStudentId() {
        return student_id;
    }


    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public void addGrade(int grade){
        if(grade>=0 && grade<=100){
            grades.add(grade);
        }else{
            System.out.println("Invalid grade. Grade should be between 0 and 100");
        }
    }
    public void study() {
        this.credits++;
    }
    public int credits(){
        return credits;
    }
    public String toString(){
        return super.toString() + "\n" + "credits " + credits;
    }

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());
        //olli.addGrade(5);
    }

}