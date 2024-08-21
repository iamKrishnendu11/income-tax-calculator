package pattern;

public class solidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=5; i++) {
            //inner
            int p = n-i;
            for(int j=1; j<=p; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
