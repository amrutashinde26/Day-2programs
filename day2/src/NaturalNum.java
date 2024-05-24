package day2programs;

public class NaturalNum {
    public static void main(String args[]) {
        int a= 10;
       // int b = natural(a);
        double avg = 1.0  * natural(a) / a ;
        System.out.println(avg);
    }

        public static int natural ( int n)
        {
            int sum = 0;
            while (n >= 1)
            {
                sum = sum + n;
                n--;
            }
            return sum;
        }
    }
