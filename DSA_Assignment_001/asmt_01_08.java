package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter number if Row and Columns : ");
        int r = sc.nextInt() ; 
        int c = sc.nextInt() ; 
        int[] array1D = new int[r * c] ; 
        System.out.print("Enter the Elements of 2D Array : ");
        int sum = 0 ; 
        for(int i = 0 ; i < array1D.length ; i++) { 
            array1D[i] = sc.nextInt() ; 
            sum += array1D[i] ; 
        }
        System.out.println("The Elements of the Array are : ");
        int[][] array2D = new int[r][c] ; 
        int index = 0 ; 
        for(int i = 0 ; i < r ; i++) { 
            for(int j = 0 ; j < c ; j++) { 
                array2D[i][j] = array1D[index] ; 
                index++ ; 
            }
        }
        for(int i = 0 ; i < r ; i++) { 
            for(int j = 0 ; j < c ; j++) { 
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of elements of 2D Array is " + sum);
        sc.close(); 
    }
    
}
