/*
2. Create a Java program that demonstrates the use of reflection in the context of a student grade analysis system.
- Define a Student class with attributes such as name, ID, and a list of grades.
    - Implement appropriate getters and setters, and include a method printInfo() to print the student's information.
- Additionally, create a GradeAnalyzer class that takes a list of grades in its constructor and provides methods for calculating the average grade and printing a summary.
- In the Start class, instantiate a GradeAnalyzer object with a list of grades, and then use reflection to access and print the field names and values of the GradeAnalyzer class.
- Iterate through the declared methods and invoke those whose names start with "calculate" or "print," printing the method names and their results.
*/

package Week10.LabCode.Exercise2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int id;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int id, ArrayList<Integer> grades){
        this.name=name;
        this.id=id;
        this.grades=grades;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades: " + grades);
    }

}

class GradeAnalyzer{
    private ArrayList<Integer> grades = new ArrayList<>();
    public GradeAnalyzer(ArrayList<Integer> grades){
        this.grades=grades;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage(ArrayList<Integer> grades) {
        double average;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        average = sum / grades.size();
        return average;
    }

    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage(this.grades));
    }
}

class Start {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        GradeAnalyzer analyzer = new GradeAnalyzer(list);

        Method[] methods = analyzer.getClass().getDeclaredMethods();
        for(Method method : methods) {
            if(method.getName().startsWith("calculate")) {
                System.out.println(method.getName());
                System.out.println(method.invoke(analyzer, analyzer.getGrades()));
            }
            if(method.getName().startsWith("print")) {
                method.setAccessible(true);
                System.out.println(method.getName());
                method.invoke(analyzer);
            }
        }
    }
}

