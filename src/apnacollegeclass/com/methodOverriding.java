package apnacollegeclass.com;
class a{

    public void meth2(){
        System.out.println("i am method 2 of class 'a' ");
    }

}

class b extends a{
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class 'b' ");
    }

    public void meth3(){
        System.out.println("i am method 3 of class 'b' ");
    }

}

public class methodOverriding {
    public static void main(String[] args) {
        a p = new a();
        p.meth2();

        b q = new b();
        q.meth2();
        q.meth3();

    }
}
