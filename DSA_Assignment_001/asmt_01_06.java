package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a number : ");
        int n = sc.nextInt() ; 
        System.out.println(n + " is odd : " + isOdd(n));
        sc.close();


    }

    public static boolean isOdd(int n ) { 
        return (n & 1) == 1 ; 

        // n is converted to binary when bitwise and is used : example : 
        // n = 7 : 0111 (in binary) , so 7 & 1 = 0111 & 0001 , (according to the bitwise & if the conditions at that position matches with the other than its true and the anwer is given 
        // here the answer for 0111 & 0001 = 0001(binary) = 1(decimal) 
    }
}

