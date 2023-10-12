package lab2;

public class Exercise9 {
    private static void drawNumbersPiramid(int n){
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++){
                System.out.print((j+1) + " ");
            }
            System.out.print("\n");
        }System.out.print("\n");
    }

    public static void main(String[] args) {
        drawNumbersPiramid(5);
        drawNumbersPiramid(10);
    }
}
