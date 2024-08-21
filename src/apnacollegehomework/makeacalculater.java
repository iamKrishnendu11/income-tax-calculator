package apnacollegehomework;
import java.util.*;
public class makeacalculater {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("press 1 for sum\npress 2 forsubstract\npress 3 for multiply\npress 4 for division\npress 5 for remainder ");
    int calculate = sc.nextInt();
    switch(calculate) {
        case 1 :
            System.out.println(a+b);
            break;
        case 2 :
            System.out.println(a-b);
            break;
        case 3 :
            System.out.println(a*b);
            break;
        case 4 :
            if(b == 0)
            System.out.println("not defined");
            else
                System.out.println(a/b);
            break;
        case 5 :
            if(b == 0)
            System.out.println("not defined");
            else
                System.out.println(a%b);
            break;
        default :
            System.out.println("invalid input");
            // press 1 for sum
            //2 for substract
            //3 for multiply
            //4 for division
            //5 for remainder
    }
    }
}
