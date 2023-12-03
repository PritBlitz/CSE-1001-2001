public class icp_ha_cla_q2 {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]) ;
        double h = Double.parseDouble(args[1]) ;
        double A = (Math.PI * Math.pow(r , 2 ) ) + (2 * Math.PI * h ) ;
        System.out.println("The Surface Area of Cylinder : " + A);
    }
}
