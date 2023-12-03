import java.util.Scanner;

public class icp_02_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        System.out.println("Enter the distance between the two cities : ");
        double km = sc.nextDouble() ;
        System.out.println(km + " km is " + (km*1000) + " meters ");
        System.out.println(km + " km is " + (km*3280.8399) + " feet ");
        System.out.println(km + " km is " + (km*39370.0787) + " inch ");
        System.out.println(km + " km is " + (km*100000) + " centimeters ");
    }
}
