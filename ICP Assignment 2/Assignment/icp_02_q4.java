import java.util.Scanner;

public class icp_02_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a value between 0 and 1000 : ");
        int x = sc.nextInt() ;
        int d1 = x / 100 ;
        int d2 = ( x / 10 ) % 10 ;
        int d3 = x % 10 ;
        int sum = d1 + d2 + d3 ;
        System.out.println("The sum of the digits if the number " + x + " = " + sum);
    }
}
