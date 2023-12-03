public class icp_02_q7 {
    public static void main(String[] args) {
        int a = 1 , b = a + 1 ;
        System.out.println("a\t\tb\t\tpow(a,b)");
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));


    }
}
