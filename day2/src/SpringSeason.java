package day2programs;

import javax.swing.*;

public class SpringSeason {
    public static void main(String args[]){
       boolean a =  Season(3,20);
       System.out.println("it is a spring season ?" + a);
    }
    public static boolean  Season(int m, int d) {
        if (m == 3 && d == 20 || m == 6 && d == 20) {
            return true;
        }
        else {
            return false ;
        }
    }
}