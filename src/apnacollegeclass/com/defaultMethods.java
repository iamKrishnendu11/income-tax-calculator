package apnacollegeclass.com;

interface MyCamera{
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

interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber(int number){
        System.out.println("calling "+ number);
    }
    void pickCall(){
        System.out.println("connecting....");
    }
}

 class mySmartPhone extends myCellPhone implements MyWifi ,MyCamera{
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

public class defaultMethods {
    public static void main(String[] args) {
        mySmartPhone oppo = new mySmartPhone();
        String[] ar = oppo.getNetwork();
        for (String elements:ar) {
            System.out.println(elements);
        }
        oppo.recordVideo4k();
    }
}
