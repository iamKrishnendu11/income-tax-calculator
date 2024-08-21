package apnacollegeclass.com;
class employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is :- " + id);
        System.out.println("my name is :- " + name);
    }
    public int getSalary(){
        return salary;

    }
}

public class firstCustomClass {
    public static void main(String[] args) {
        System.out.println("hello");
        employee krishnendu = new employee(); // instantiating a new employee object
        krishnendu.id = 12; // setting propreties
        krishnendu.name = "Krishnendu Mandal";
        krishnendu.salary = 100000;
        System.out.println(krishnendu.name);
        //calling methods
        krishnendu.printDetails();

        employee john = new employee();
        john.id = 13;
        john.name = "john adams";
        john.salary = 70000;
        john.printDetails();
        System.out.println(john.getSalary());
    }
}
