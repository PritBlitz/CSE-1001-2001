import java.util.Scanner;

public class icp_02_q6 {
    public static void main(String[] args) {
        double g = 32.174 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the time in seconds : ");
        double t = sc.nextDouble() ;
        double d = (1.0/2) * g * Math.pow(t , 2) ;
        System.out.println("Distance Travelled = " + d );
        sc.close();

    }
}
