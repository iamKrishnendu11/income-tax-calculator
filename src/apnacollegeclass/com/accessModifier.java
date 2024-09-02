package apnacollegeclass.com;
class c1{
    public int x =5;
    protected int y = 6;
    int z = 7;
    private int t = 8;
    void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
    }
}

public class accessModifier {
    public static void main(String[] args) {
        // we can use all modifier in same class
     c1 c = new c1();
     c.meth1();
        //cannot use private modifier in same package
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.t);


     }
}
