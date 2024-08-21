package apnacollegeclass.com;

class hello{
    int a;

    public int getA() {
        return a;
    }

    hello(int b){
        this.a = b;
    }
}

class hello1 extends hello{
    hello1(int c){
        super(c);
        System.out.println("i am a constructors");
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        hello e = new hello(5);
        System.out.println(e.getA());
        hello1 f = new hello1(115);
        

    }
}
