package DSA_Assignment_001;


import java.util.Scanner;

public class asmt_01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a number : ");
        int n = sc.nextInt() ; 
        int temp = n , sum = 0 , product = 1; 
        while (temp > 0) { 
            int rem = temp % 10 ; 
            sum += rem ; 
            product *= rem ; 
            temp /= 10 ; 
        }
        System.out.println("Sum of digits of  " + n + " : " + sum );
        System.out.println("Product of digits of " + n + " : " + product );
        if (sum == product ) {
            System.out.println(n + " is a spy number ");
        }
        else { 
            System.out.println(n + " is not a spy number ");
        }
        sc.close(); 
    }
    
}
