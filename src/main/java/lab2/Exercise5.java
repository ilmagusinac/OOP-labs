package lab2;
import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());

        int sum = 0;

        for(int i=0; i<=n; i++){
            sum+=((int)Math.pow(2,i));

        }
        System.out.println("The result is: " + sum);
    }
}
