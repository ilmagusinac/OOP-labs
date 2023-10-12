package lab2;

public class Exercise8b {
    private static void drawStarsPiramid(int n){
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++){
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
