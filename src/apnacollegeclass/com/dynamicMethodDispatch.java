package apnacollegeclass.com;
class phone {
    public void showtime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turning on the phone.....");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("play music...");
    }
    public void on(){
        System.out.println("turning on the smartphone....");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
      phone nokia1200 = new phone(); // object creation on runtime
      nokia1200.on();
      smartphone galaxym21 = new smartphone();
      galaxym21.music();

      phone vivot2 = new smartphone();
      // reference superclass object subclass possible. reverse is not possible.
        vivot2.showtime();
        vivot2.on();
       /* vivot2.music();
       not possible ,   */
    }
}
