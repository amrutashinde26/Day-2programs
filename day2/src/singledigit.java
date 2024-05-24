package day2programs;

public class singledigit {
    public static void main(String args[]) {
        single(462);
    }

    public static void single(int n) {

        if (n == 0) {
            System.out.println("Zero");
        }
        singlenum(n);
    }

    public static void singlenum(int n) {
        if (n == 0) {
            return;
        }
        //for (int i = 0; i < n; i++) {
            int d = n % 10;
            singlenum(n / 10);
            //n = n / 10;
            switch (d)
            {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
        }
    }


