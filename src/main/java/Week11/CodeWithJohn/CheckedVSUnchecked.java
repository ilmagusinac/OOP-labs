package Week11.CodeWithJohn;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVSUnchecked {
    //checked exceptions
    /*
    public static void main(String[] args) throws FileNotFoundException{
        readFile("myFile.txt");
    }
    /*
    private static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName); //if a file doesn't exist it could throw filenot found exception
        //FileNotFound exception is a checked exception - we need to deal with the possibility of filenotfund exception at compile time
        //checked expecions are dealts with at compile time
    }
    */

    //firstly we could do the try-catch
    /*
    private static void readFile(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
        }catch (FileNotFoundException fnfe){
            System.out.println("The file doesn't exist");

        }
    }
    */
/*
    //firstly we could put throws
    //but we need to catch it in the main -> with try catch
    //or declare that we throw this exception in the method signature
    private static void readFile(String fileName) throws FileNotFoundException{
        FileReader reader = new FileReader(fileName);

    }
    */

    //unchecked exceptions
    public static void main(String[] args){
        String name = null; //NullPointerException - unchecked exception doesnt give us a warrning and it can compile
        printLength(name);
    }

    /*
    private static void printLength(String myString){
        try {
            System.out.println(myString.length());
        }catch(NullPointerException npe){
            System.out.println("String cannot be null");
        }
    }*/

    private static void printLength(String myString){
       // throw new Exception(); //this is a checked exception
        throw new RuntimeException(); //unchecked exception - somewhere in the line we have to deal with the checked exceptions
    }
}
