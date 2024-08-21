package apnacollegeclass.com;

class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int a){
        System.out.println("i am a overloaded constructors with a value of:- "+a);
    }
}

class derived1 extends base1{
    derived1(){
       // super(7);
        System.out.println("i am a derived class constructors");
    }
    derived1(int a, int b){
        super(a);
        System.out.println("i am a derived overloaded constructors with value b as "+b);
    }
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("i am a child of derived constructors");
    }
    childOfDerived(int a,int b, int c) {
        super(a,b);
        System.out.println("i am a child overloaded constructors with value c as "+c);
    }
}

public class constructorsInInheritance {
    public static void main(String[] args) {
      //  base1 d = new base1();
       // derived1 e = new derived1();
       // derived1 f = new derived1(9,11);
        childOfDerived g = new childOfDerived(14,15,16);
    }
}
