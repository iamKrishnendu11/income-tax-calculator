package apnacollegehomework;
import java.util.Scanner;
import apnacollegeclass.com.*;
import org.w3c.dom.ls.LSOutput;

public class incomeTaxCalculator {
    /* 0-2.5 lakh == no tax
    2.5-5 lakh == 5%
    5-7.5 lakh == 10%
    7.5-10 lakh == 20%
    10 lakh == 30%     */
    public static void main(String[] args) {
        System.out.println("enter your income in lakh :-");
        Scanner sc = new Scanner(System.in);
        float incomeInLakhs = sc.nextFloat();
        float tax = 0;
        if(incomeInLakhs < 2.5f) {
            tax = tax+ 0;
        }
        else if(incomeInLakhs > 2.5f && incomeInLakhs < 5.0f) {
            tax = tax + 0.05f * (incomeInLakhs - 2.5f);
        }
        else if (incomeInLakhs > 5.0f && incomeInLakhs < 7.5f) {
            tax = tax + (0.05f * 2.5f) + 0.1f *(incomeInLakhs - 5.0f);
        }
        else if (incomeInLakhs > 7.5f && incomeInLakhs < 10f) {
            tax = tax + (0.05f * 2.5f) + (0.1f * 2.5f) + 0.2f * (incomeInLakhs - 7.5f);
        }
        else if(incomeInLakhs > 10.0f) {
            tax = tax + (0.05f * 2.5f) + (0.1f * 2.5f) + (0.2f * 2.5f) + 0.3f * (incomeInLakhs - 10.0f);
        }
        System.out.println( "your tax is " +tax * 100000 +" rupees");
    }
}
