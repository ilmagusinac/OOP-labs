package lab1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number>0){
            System.out.println("The number is positive");
        } else if(number<0){
            System.out.println("The number is not positive");
        } else{
            System.out.println("The number is 0");
        }
    }
}