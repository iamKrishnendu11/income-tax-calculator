package apnacollegeclass.com;

public class variableArguments {
    static int sum( int a, int b){
        return a+b;
    }

    static int sum(int ...arr) {
        // int []arr;
        int result = 0;
        for (int element : arr) {
            result += element;
        }
            return result;
    }
        public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is "+ sum(4, 5));
            System.out.println("the sum of 11, 19 ,6,7 is "+sum(11,19,6,7) );
            System.out.println("the sum of 26 and 9 is "+sum(26, 9));
    }
}
