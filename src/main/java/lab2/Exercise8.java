package lab2;

public class Exercise8 {
    private static void drawStarsPiramid(int n){
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }System.out.print("\n");
    }

    public static void main(String[] args) {
        drawStarsPiramid(5);
        drawStarsPiramid(10);
    }
}
