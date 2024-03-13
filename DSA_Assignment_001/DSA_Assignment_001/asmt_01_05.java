package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a number : ");
        int n = sc.nextInt() ; 
        System.out.println("Sum of digits of " + n + " until the number is a single digit is " + sum_Of_Digits(n));
        sc.close(); 
    }

    public static int sum_Of_Digits(int n) { 
        int sum = 0 ; 
        while(n > 0) { 
            int rem = n % 10 ; 
            sum += rem ; 
            n /= 10 ; 
        }
        while(sum > 9) { 
            sum = sum_Of_Digits(sum) ; 
        }
        return sum ; 
    }
}
