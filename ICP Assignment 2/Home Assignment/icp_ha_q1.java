import java.util.Scanner;

public class icp_ha_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of minutes : ");
        int m = sc.nextInt() ;
        int y = m / (365*24*60) ;
        int r = m % (365*24*60) ;
        int d = r / (24*60) ;
        System.out.println(m + " minutes is approximately = " + y + " years and " + d + " days !" );
    }
}
