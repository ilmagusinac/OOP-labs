package Week10.LectureCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//Regular Expressions example
        /*
        System.out.println("Give student number: ");
        String num = reader.nextLine();

        if(num.matches("01[0-9]{7}")){
            System.out.println("The form is valid.");
        }else{
            System.out.println("The form is not valid.");
        }
         */

//Vertical Bar: Logical or
        /*
        //String string = "00"; //match
        String string = "1111"; //not a match
        if(string.matches("00|111|0000")){
            System.out.println("The string was matched by some of the alternatives");
        } else{
            System.out.println("The string was not matched by any of the alternatives");
        }
         */

//Round Brackets: a Delimeted Part of the String
        /*
        System.out.println("Write a form of the verb to look: ");
        String word = reader.nextLine();
        if(word.matches("look(s|ed|ing|er)")){
            System.out.println("Well done!");
        } else{
            System.out.println("Check again the form.");
        }
         */

//REPETITIONS

        //*
        /*
        String string = "trolololololo";
        if(string.matches("trolo(lo)*")){
            System.out.println("The form is right");
        }else{
            System.out.println("The form is wrong");
        }
         */

        //+
        /*
        String string = "trolololololo";
        if(string.matches("tro(lo)+")){
            System.out.println("The form is right");
        }else{
            System.out.println("The form is wrong");
        }
         */

        //?
        /*
        String string = "You have accidentally the whole name";
        if(string.matches("You have accidentally (deleted )?the whole name")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
         */

        //{a}
        /*
        String string = "1010";
        if(string.matches("(10){2}")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
         */

        //{a,b}
        /*
        String string = "1";
        if(string.matches("1{2,4}")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
         */

        //{a,}
        /*
        String string = "11111";
        if(string.matches("1{2,}")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
         */


    }

}
