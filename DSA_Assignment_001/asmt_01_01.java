package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in)) ; 
        System.out.print("The positive integer greater than 2 is ");
        int n = sc.nextInt() ; 
        int count = 0 ; 
        while (n > 2 ) { 
            n /= 2 ; 
            count++ ; 
        }         
        System.out.println("The number of times one must repeatedly divide this number by 2 before fetting a value less than 2 is " + count);
        sc.close(); 
    }
}


