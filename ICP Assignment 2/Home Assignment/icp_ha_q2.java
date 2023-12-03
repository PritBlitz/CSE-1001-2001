import java.util.Scanner;

public class icp_ha_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of eggs : ");
        int e = sc.nextInt() ;
        int gross = e / 144 ;     // 1 gross = 144 eggs
        int r = e % 144 ;
        int dozen = r / 12 ;      // 1 dozen = 12 eggs
        int eggs = r % 12 ;
        System.out.println(e + " eggs = " + gross + " gross " + dozen + " dozen " + eggs + " eggs ! ");

    }
}
