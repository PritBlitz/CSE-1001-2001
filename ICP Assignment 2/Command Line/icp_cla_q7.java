public class icp_cla_q7 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]) ;
        int y = Integer.parseInt(args[1]) ;
        int z = Integer.parseInt(args[2]) ;
        System.out.println((boolean)((x <= y * z) || (y <= x * z) || (z <= x * y)));
    }
}
