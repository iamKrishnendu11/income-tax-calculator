package apnacollegeclass.com;

public class methods {
    static void tellJoke() {
        System.out.println("i invented a new word\n plagiarism!");
    }

    static int logic( int a , int b) {
        a = 8;
        b = 11;
        int c = a + b;
        return c;
    }

    static void logic2(int [] arr){
     arr[0] = 234;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = logic(x, y);
        System.out.println(z);
// calling a method
        int x1 = 12;
        int y1 = 24;
        methods obj = new methods();
        int z1 = obj.logic(x1,y1);
        System.out.println(z1);
        tellJoke();
        int [] marks = {34, 67, 78, 89, 7};
        // case 1 changing the integer
        int a = 45;
        int b = 199;
        logic(a, b);
        System.out.println(a);
        //changing thr arr
        logic2( marks);
        System.out.println(marks[0]);



    }
}
