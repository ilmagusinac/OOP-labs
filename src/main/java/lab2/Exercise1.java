package lab2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String pass = "carrot";

        while(true) {
            System.out.print("Type a password: ");
            String new_pass = reader.nextLine();

            if(pass.equals(new_pass)){
                System.out.println("Right!");
                break;
            }

            System.out.println("Wrong!");
        }
        System.out.println("\nThe secret is: jryy qbar!");
    }
}
