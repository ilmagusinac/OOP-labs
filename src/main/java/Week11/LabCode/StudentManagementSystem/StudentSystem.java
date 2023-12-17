package Week11.LabCode.StudentManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {

    public List<Student> students;
    public StudentSystem(String fileName) {
        students = new ArrayList<>();
        try {
            students = readStudents(fileName);
        } catch (IOException e) {
            System.out.println("Unable to read a file");
        }
    }
    /*
    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        System.out.println("Students Details");
        studentSystem.printStudentDetails();
        System.out.println("\nDetails of student with ID 10:");

    }

     */
    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        System.out.println("Students Details");
        studentSystem.printStudentDetails();

        System.out.println("\nDetails of student with ID 10:");
        Optional<Student> studentWithId10 = studentSystem.getStudentById(10);
        studentWithId10.ifPresentOrElse(
                student -> System.out.println(student),
                () -> System.out.println("Student with ID 10 not found.")
        );

        System.out.println("\nDetails of student with the highest GPA:");
        try {
            Student highestGPAStudent = studentSystem.getHighestGPAStudent();
            System.out.println(highestGPAStudent);
        } catch (EmptyStudentListException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nDetails of student with the longest name:");
        try {
            Student longestNameStudent = studentSystem.getLongestNameStudent();
            System.out.println(longestNameStudent);
        } catch (EmptyStudentListException e) {
            System.out.println(e.getMessage());
        }
    }


    public void printStudentDetails() {
        students.forEach(student -> System.out.println(student.getName()));
    }

    public static List<Student> readStudents(String fileName) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for (String line : lines) {

            String[] parsedLine = line.split(",");
            /*
            Student temp = new Student(parsedLine[0] == "" ? 0 : Integer.parseInt(parsedLine[0]), parsedLine[1], parsedLine[2], parsedLine[3], parsedLine[4] == "" ? 1 : Double.parseDouble(parsedLine[4]), parsedLine[5] == "" ? 2 : Double.parseDouble(parsedLine[5]));
            students.add(temp);

             */
            if (parsedLine.length == 5) {
                int ID = Integer.parseInt(parsedLine[0]);
                String name = parsedLine[1];
                String university = parsedLine[2];
                String department = parsedLine[3];
                double GPA = Double.parseDouble(parsedLine[4]);

                students.add(new Student(ID, name, university, department, GPA));
            }
        }
        bufferedReader.close();
        return students;
    }

    public Optional<Student> getStudentById(int id) {
        for (Student student : students) {
            if (student.getID() == id)
                return Optional.of(student);
        }
        //throw new StudentNotFoundException("Student could not be found");
        return Optional.empty();
    }

    public Student getHighestGPAStudent() {

        if(students.isEmpty()){
            throw  new EmptyStudentListException("List of students is empty");
        }
        Student highestGPA = students.get(0);
        for (Student student : this.students) {
            if (student.getGPA() > highestGPA.getGPA())
                highestGPA = student;
        }
        return highestGPA;
    }

    public Student getLongestNameStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }

        Student longestNameStudent = students.get(0);
        for (Student student : students) {
            if (student.getName().length() > longestNameStudent.getName().length()) {
                longestNameStudent = student;
            }
        }
        return longestNameStudent;
    }







}
