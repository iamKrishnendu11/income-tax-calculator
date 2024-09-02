package apnacollegeclass.com;

class MyThread extends Thread{
    public void run(){
        while(true) {
            System.out.println("thread 1 is for chatting");
            System.out.println("i am happy");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("thread 2 is for cooking");
            System.out.println("i am sad");
        }
    }
}
public class extendingThreadClass{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
