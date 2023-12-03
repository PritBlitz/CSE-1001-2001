public class  icp_ha_cla_q3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]) ;
        int sum = (n  / 1000 ) + (n % 10) ;
        System.out.println("The sum of the First and Last Digit of a four digit number = " + sum );
    }
}
