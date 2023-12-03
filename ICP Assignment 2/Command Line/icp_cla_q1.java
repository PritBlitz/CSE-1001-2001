public class icp_cla_q1 {
    public static void main(String[] args) {
        int div, dsr, rem, qt;
        div = Integer.parseInt(args[0]);
        dsr = Integer.parseInt(args[1]);
        qt = div / dsr;
        rem = div % dsr;
        System.out.println("Quotient = " + qt + "\nRemainder = " + rem);
    }

}
