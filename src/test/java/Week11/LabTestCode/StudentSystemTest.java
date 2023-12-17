package Week11.LabTestCode;

import Week11.LabCode.StudentManagementSystem.EmptyStudentListException;
import Week11.LabCode.StudentManagementSystem.Student;
import Week11.LabCode.StudentManagementSystem.StudentSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
class StudentSystemTest {

    static StudentSystem system;

    @BeforeEach
    void initializeStudents() {
        system = new StudentSystem("students.csv");
    }

    @Test
    public void testIfStudentIsPresent() {
        assertFalse(system.students.isEmpty());
    }



    @Test
    public void testStudentWithId100() {
        assertFalse(system.getStudentById(100).isPresent());
    }

    @Test
    public void testStudentNull() {
        assertNotNull(system.getHighestGPAStudent());
    }

    @Test
    public void testHighestGPAStudent() {
        assertNotNull(system.getHighestGPAStudent());
    }

    @Test
    public void testExceptionForEmptyStudentList() {
        assertThrows(EmptyStudentListException.class, () -> {
            StudentSystem emptyStudentSystem = new StudentSystem("empty.csv");
            emptyStudentSystem.getHighestGPAStudent(); // Triggering an operation on an empty list
        });
    }

    @Test
    void testNamesArray() {
        String[] expectedNames = {"Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"};
        List<String> actualNames = system.students.stream()
                .map(Student::getName)
                .limit(5)
                .collect(Collectors.toList());
        assertIterableEquals(Arrays.asList(expectedNames), actualNames);
    }


    @Test
    public void testSize() {
        assertEquals(70, system.students.size());
    }


    @Test
    public void testLargestName() {
        Student studentWithLargestName = system.getLongestNameStudent();
        assertNotEquals("Ava White", studentWithLargestName.getName());
    }

    @Test
    public void testStudents() {
        Student highestGPAStudent = system.getHighestGPAStudent();
        Student longestNameStudent = system.getLongestNameStudent();
        assertNotSame(highestGPAStudent, longestNameStudent);
    }

    @Test
    public void testSameStudent() {
        Student highestGPAStudent = system.getHighestGPAStudent();
        Optional<Student> studentById12 = system.getStudentById(12);
        assertTrue(studentById12.isPresent());
        assertSame(highestGPAStudent, studentById12.get());
    }
}
