package day2programs;

import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter The Input");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = b*b-4*a*c ;
        if(delta<0){
            System.out.println("This Equation Has No Real Root");
        } else if ((delta == 0)) {
           double  root = -b / (2 * a );
            System.out.println("The Equation Has Real Root Is : " + root );
        }
        else
        {
          double  root1 = (-b + Math.sqrt(delta))/(2*a);
          double root2 =   (-b - Math.sqrt(delta))/(2*a);
          System.out.println("The Equation Has Two Real Root Is :"+ root1 + "and"+ root2);
        }
        input.close();

    }
}
