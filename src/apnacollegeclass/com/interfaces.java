package apnacollegeclass.com;

interface bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface turning{
    void turnRight();
    void turnLeft();
}

class heroCycle implements bicycle, turning{
    int speed = 15;
    void blowHorn(){
        System.out.println("cring cring......");
    }
    public void applyBrake(int decrement){
        System.out.println("applying brake.....");
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        System.out.println("applying speedup....");
        speed = speed + increment;
    }
    public void turnRight(){
        System.out.println("turning to right....");
    }
    public void turnLeft(){
        System.out.println("turning to left....");
    }
}

public class interfaces {
    public static void main(String[] args) {
        heroCycle cycleKrish = new heroCycle();
        cycleKrish.applyBrake(5);
        System.out.println("new speed:- "+cycleKrish.speed);
        cycleKrish.blowHorn();
        cycleKrish.turnLeft();
    }
}
