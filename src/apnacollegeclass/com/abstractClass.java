package apnacollegeclass.com;
abstract class base2{
    public base2(){
        System.out.println("i am a constructor of base 2");
    }
    public void sayHello(){
        System.out.println("hello....");
    }
    abstract public void greet();
}

class derived3 extends base2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}

abstract class derived4 extends base2{
    public void th(){
        System.out.println("i am good");
    }
}

public class abstractClass {
    public static void main(String[] args) {
       // base2 a = new base2(); not possible . abstract class
        derived3 b = new derived3();
       // derived4 c = new derived4(); abstract class
        }
    }

