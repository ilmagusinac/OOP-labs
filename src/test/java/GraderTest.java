import Week11.LectureCode.UnitTest.Grader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GraderTest {
    @Test
    public void fiftyNineShouldReturnF(){
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD(){
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC(){
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    public void eightyNineShouldReturnB(){
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA(){
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    public void negativeShouldReturnException(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
    }

    @Test
    public void negativeShouldReturnExactException(){
        Grader grader = new Grader();
        //we we can do this with only using the lambdas - WATCH A TUTORIAL!!
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1); //code that executes the test
        });
    }
}
