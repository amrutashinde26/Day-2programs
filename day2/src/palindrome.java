package day2programs;

public class palindrome {
    public static void main(String args[]){
        ispalindrome(54692);
    }
    public static void  ispalindrome(int n){
        int reverse = 0 , temp = n ;
        while(n>0)
        {
            int d = n % 10 ;
            reverse = reverse * 10 + d ;
            n= n/10;
        }
        if(reverse == temp){
            System.out.println("is a palindrome number");

        }
        else {
            System.out.println("is not a palindrome ");
        }
    }
}
