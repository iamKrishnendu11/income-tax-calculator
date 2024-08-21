package apnacollegeclass.com;

class myMainEmployee{
    private int id;
    private String name;

    public myMainEmployee(String name, int id) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        myMainEmployee krish = new myMainEmployee("krishnendu Mandal" , 12);
        System.out.println(krish.getName());
        System.out.println(krish.getId());
    }
}
