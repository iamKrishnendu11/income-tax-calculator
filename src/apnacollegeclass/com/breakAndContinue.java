package apnacollegeclass.com;

public class breakAndContinue {
    public static void main(String[] args) {
        //break
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "hello");
            if (i == 2){
                System.out.println("stop");
                break;
        }
    }
        //coninue
        for(int j=0; j<5; j++) {
            if(j==2) {
                System.out.println("hi");
                continue;
            }
            System.out.println("bye");
        }
    }
}
