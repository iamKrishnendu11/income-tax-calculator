package pattern;

public class butterfly {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n;i++) {
            //first part
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //second part
            int space = 2 * (n-i);
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            //third part
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n; i>=1;i--) {
            //first part
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //second part
            int space = 2 * (n-i);
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            //third part
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}