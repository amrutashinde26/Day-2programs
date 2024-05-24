package day2programs;

import java.util.Scanner;

public class vowel {
    public static void main(String args[]) {
        /*char b = 'c';
        if (b == 'a' || b == 'e' || b == 'i' || b == 0 || b == 'u') {
            System.out.println("is a vowels");

        } else {
            System.out.println("is a consonent");
        }*/


        Scanner sc = new Scanner(System.in);
        String d = "b";
        String c = d.toLowerCase();
        if (c.equals("a") || c.equals("e") || c.equals("i")|| c.equals("o") || c.equals("u")) {
            System.out.println("is a vowels");
        }
        else
        {
            System.out.println("is a consonent");
        }
    }
}