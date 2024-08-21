package apnacollegeclass.com;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting x now");
        this.x = x;
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        derived c = new derived();
        c.setX(5);
        System.out.println(c.getX());
        c.setY(9);
        System.out.println(c.getY());

    }
}
