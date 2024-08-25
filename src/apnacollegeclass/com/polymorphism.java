package apnacollegeclass.com;

interface MyCamera2{
void takeSnap();
void recordVideo();
default void recordVideo4k(){
    selfie();
    System.out.println("Recording video in 4k");
}
private void selfie(){
    System.out.println("taking selfie");
}
}

interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void callNumber(int number){
        System.out.println("calling "+ number);
    }
    void pickCall(){
        System.out.println("connecting....");
    }
}

class mySmartPhone2 extends myCellPhone implements MyWifi2 ,MyCamera2{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("recording a video");
    }
    public String[] getNetwork(){
        System.out.println("getting list of networks");
        String[] networkList = {"harry", "Anjali5G", "prasant"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to"+ network);
    }
}


public class polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new mySmartPhone2();
        // this is a smartphone but use it for camera. cannot access wifi
        cam1.recordVideo4k();
        cam1.recordVideo();
    }
}
