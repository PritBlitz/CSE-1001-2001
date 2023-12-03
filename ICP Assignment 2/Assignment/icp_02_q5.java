import java.util.Scanner;

public class icp_02_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the radius of the hemisphere : ");
        double r = sc.nextDouble() ;
        double sa = 3 * Math.PI * Math.pow(r , 2) ;
        double vol = (2.0/3) * Math.PI * Math.pow(r , 3) ;
        System.out.println("Surface area of the Hemisphere = " + sa);
        System.out.println("Volume of the Hemisphere = " + vol);
        sc.close();
    }
}
