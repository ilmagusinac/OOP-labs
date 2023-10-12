package lab2;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int random_int = (int)Math.floor(Math.random() * (max-min+1) + min);
        int n = random_int + 10;
        int guesses = 1;

        while (n != random_int) {
            System.out.print("Guess a number: ");
            n = reader.nextInt();

            if (n == random_int) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (n > random_int) {
                System.out.println("The number is lesser, guesses made: " + guesses);
                guesses++;
            } else {
                System.out.println("The number is greater, guesses made: " + guesses);
                guesses++;
            }
        }
    }
}
