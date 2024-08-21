package apnacollegeclass.com;

public class methodOverloading {
    static void foo() {
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good morning " + a);
    }
    static void foo(int a, int b){
        System.out.println("good morning "+ a);
        System.out.println("good morning "+ b);
    }

    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(2000, 4000);
    }
}
