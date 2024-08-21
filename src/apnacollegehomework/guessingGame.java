package apnacollegehomework;
import java.util.Scanner;
import java.util.Random;
class randomNumber{
    public int computerCall;
    public int yourCall;
    public int noOfGuesses = 0;

    randomNumber() {
    Random rc = new Random();
    computerCall = rc.nextInt(101);
    }

     void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        yourCall = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
       if(yourCall == computerCall){
           System.out.println("you guessed it right the no is:- " +computerCall);
           System.out.println("you guessd it in:-"+noOfGuesses+" attempts");
           return true;
       }
       else if(yourCall<computerCall) {
           System.out.println("too low...\ntry again");
       }
       else {
           System.out.println("too high....\ntry again");
       }
           return false;
    }
}

public class guessingGame {
    public static void main(String[] args) {
        System.out.println("guess the number:-");
      randomNumber g = new randomNumber();
      boolean b = false;
      while(!b) {
          g.takeUserInput();
           b = g.isCorrectNumber();
          System.out.println(b);
      }
    }
}
