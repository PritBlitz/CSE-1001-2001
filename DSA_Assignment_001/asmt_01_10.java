package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a 3-by-4 matrix row by row :");
        double[][] a = new double[3][4] ; 
        for(int i = 0 ; i < 3 ; i++) { 
            for(int j = 0 ; j < 4 ; j++) { 
                a[i][j] = sc.nextDouble() ; 
            }
        }
        for(int j = 0 ; j < 4 ; j++) { 
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(a, j));
        }
        sc.close();
    }
    public static double sumColumn(double[][] m , int columnIndex) { 
        double sum = 0 ; 
        for(int i = 0 ; i < 3 ; i++) { 
            sum += m[i][columnIndex] ; 
        }
        return sum ; 
    }
    
}
