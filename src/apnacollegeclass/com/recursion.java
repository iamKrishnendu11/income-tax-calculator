package apnacollegeclass.com;

public class recursion {
    // n! = n*(n-1)!
    static int  factorial(int a){
        if(a==0 || a==1){
                return 1;
        }
        else{
                return a * factorial(a-1);
            }
        }

    public static void main(String[] args) {
        System.out.println("the value of factorial 4 is :- " +factorial(4));
        System.out.println("the value of factorial 9 is :- " +factorial(9));
    }
}
