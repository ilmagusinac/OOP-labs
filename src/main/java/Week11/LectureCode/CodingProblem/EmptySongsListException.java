package Week11.LectureCode.CodingProblem;

import Week11.LabCode.StudentManagementSystem.EmptyStudentListException;

import java.util.NoSuchElementException;

public class EmptySongsListException extends NoSuchElementException {
    public EmptySongsListException(){}

    public EmptySongsListException(String message){
        super(message);
    }
    public EmptySongsListException(Throwable cause){
        super(cause);
    }

}
