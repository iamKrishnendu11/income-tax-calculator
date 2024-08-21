package pattern;

public class diamond {
    public static void main(String[] args) {
        int n= 4;
        for(int i=1; i<=n; i++) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //left part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //right part
            for(int j=2;j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //left part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //right part
            for(int j=2;j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
