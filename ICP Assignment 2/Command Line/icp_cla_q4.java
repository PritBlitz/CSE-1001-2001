public class icp_cla_q4 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        t = Math.toRadians(t) ;
        double r = Math.cos(5*t) + Math.sin(7 * t) ;
        System.out.println("cos(5t) + sin(7t) = " + r);
    }

}