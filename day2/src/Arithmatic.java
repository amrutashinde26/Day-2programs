package day2programs;

import java.util.Scanner;

public class Arithmatic{
    public static void main(String args []){
        // staart
        // Input Handling
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value ");
        double a = input.nextDouble();
        System.out.println("Enter second value ");
        double b= input.nextDouble();
        System.out.println("Enter third  value ");
        double c= input.nextDouble();

        // calculations
        double result1 =  a+b*c ;
        System.out.println( "First Result Is " + result1);
        double result2 =  c+a/b ;
        System.out.println("Second Result Is " + result2);
        double result3 =  a%b+c ;
        System.out.println("Third Result Is " + result3);
        double result4 =  a*b+c ;
        System.out.println("Fourth result Is " + result4);

        // finding maximum and minimum
        double max = Math.max(Math.max(result1, result2) ,Math.max(result3 , result4));
        double min = Math.min(Math.min(result1 , result2), Math.min(result3 , result4));

        // Output Max And Min
        System.out.println("Maximum value is " + max);
        System.out.println("Minimum Value is " + min);
    }
}
