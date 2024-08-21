package apnacollegeclass.com;
import java.util.*;
public class conditionalstatement {
    public static void main(String[] args) {
        //if else statement
        // identify minor or adult
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18)
            System.out.println("adult");
        else
            System.out.println("minor");
        //else if statement
     // input 2 number a and b , and find which is bigger
     int a = sc.nextInt();
     int b = sc.nextInt();
     if(a == b)
       System.out.println("a and b are equal");
     else if(a > b)
       System.out.println("a is bigger");
     else
        System.out.println("b is bigger");
     // switch
        // print the greeting 1.hello 2.namaste 3.bonjur
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjur");
                break;
            default:
                System.out.println("invalid statement");
                break;
        }
//modulo statement
        int x = sc.nextInt();
        if(x%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
