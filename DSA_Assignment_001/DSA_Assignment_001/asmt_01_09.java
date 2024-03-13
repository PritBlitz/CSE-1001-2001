package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a 4 by 4 matrix row by row : ");
        double[][] a = new double[4][4] ; 
    
        for(int i = 0 ; i < 4 ; i++) { 
            for(int j = 0 ; j < 4 ; j++) { 
                a[i][j] = sc.nextDouble() ; 
            }
        }
  //      for(int i = 0 ; i < 4 ; i++) { 
  //          for(int j = 0 ; j < 4 ; j++) { 
  //              System.out.print(a[i][j] + " ");
  //          }
  //          System.out.println();
        
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(a));
        sc.close();
        
    }

    public static double sumMajorDiagonal(double[][] m ) {
        double sum = 0 ; 
        for(int i = 0 ; i < 4 ; i++) { 
            for (int j = 0 ; j < 4 ; j++) { 
                if(i == j) { 
                    sum += m[i][j] ; 
                }
            }
         }
         return sum ; 
    }
    
}
