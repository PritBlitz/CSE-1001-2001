package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter the number of elements of the Array : "); 
        int n = sc.nextInt() ; 
        int[] a = new int[n] ; 
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < a.length ; i++  ) { 
            a[i] = sc.nextInt() ; 
        }
        System.out.println("Maximum element of Array is " + maximum(a) + " and occurs " + occurs(a, maximum(a)) + (occurs(a , maximum(a))  > 1 ? " times ." : " time .")); 
        System.out.println("Minimum element of Array is " + minimum(a) + " and occurs " + occurs(a, minimum(a)) + (occurs(a , minimum(a))  > 1 ? " times ." : " time ."));
        System.out.println("First Occurrence of Maximum element is at position " + firstOccurrence(a, maximum(a)));
        System.out.println("Last Occurrence of Minimum element is at position " + lastOccurrence(a, minimum(a)));

        sc.close(); 
    }

    static int maximum(int[] a  ) {
        int max = a[0];
        for(int i = 0 ; i < a.length ; i++ ){ 
            if (a[i] > max ) {
                max = a[i] ;   
            }
        }
        return max ; 
    }

    static int minimum(int[] a) { 
        int min = a[0] ; 
        for(int i = 0 ; i < a.length ; i++) { 
            if (a[i] < min) {
                min = a[i] ; 
                
            }
        }
        return min ; 
    }

    static int occurs(int[] a , int target) { 
        int count = 0 ;
        for(int i = 0 ; i < a.length ; i++ ) { 
            if (a[i] == target)  {
                count++ ; 
                
            }
        } 
        return count ; 
    }

    static int firstOccurrence(int[] a , int target) { 
        for(int i = 0 ; i < a.length ; i++ ) { 
            if(a[i] == target) { 
                return i ; 
            } 
        }
        return -1 ; 
    }

    static int lastOccurrence(int[] a , int target ) { 
        for(int i = a.length - 1 ; i >= 0 ; i--) {
            if (a[i] == target ) {
                return i ; 
            }
        }
        return -1 ; 
    }

    
}
