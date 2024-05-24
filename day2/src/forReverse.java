package day2programs;

public class forReverse {
    public static void main(String args []){
     reverse(5235842);
    }
    public static void reverse(int n)
    {
     int reversenum  = 0 ;
     for(int i = n ; n > 0; n= n/10 ){
         int d = n % 10 ;
         reversenum = reversenum * 10 + d ;
     }System.out.println("reversed number  " + "is : "  + reversenum ) ;
    }
}

