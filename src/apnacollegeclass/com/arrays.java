package apnacollegeclass.com;

public class arrays {
    public static void main(String[] args) {
        /* classroom of 500 students. you have to store marks of all 500 students
        you have 2 option
        1. create 500 variable
        2.use arrays
         */
        int [] marks = {100, 70, 80, 71, 98};
        //displaying an array (for loop)
        for (int mark : marks) {
            System.out.println(mark);
        }
        // using for each loop
        for(int element: marks) {
            System.out.println(element);
        }

    }
}
