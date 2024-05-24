package day2programs;

public class fornatural {
    public static void main(String args[]) {
        int a = 10;
        double avg = 1.0 * natural(a) / a;
        System.out.println(avg);

    }
      public static int  natural(int n)
        {
          int sum = 0 ;
          for(int i = n ; i>=1; i--){
              sum = sum + n ;
              n--;
          }
          return sum ;
        }
    }

