package lab6.Exercise7;
import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInTheLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.height = 10;
        this.width = 20;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        this.starsInTheLastPrint = 0;
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInTheLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print() {
        int totalStars = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            totalStars += this.starsInTheLastPrint;
        }
        this.starsInTheLastPrint = totalStars;
    }

    public int starsInLastPrint() {
        return this.starsInTheLastPrint;
    }
}
