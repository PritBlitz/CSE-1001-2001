package DSA_Assignment_001;

public class asmt_01_04 {
    public static void main(String[] args) {
        char[] c = {'c' , 'a' , 'r' , 'b' , 'o' , 'n'} ; 
        permutation(c, 0);

    }

    static void swap(char[] a , int i , int j) { 
        char temp = a[i] ; 
        a[i] = a[j] ; 
        a[j] = temp ; 
    }

    static void permutation(char[] a , int curIndex ) { 
        if (curIndex == a.length - 1) { 
            System.out.println(new String(a));            
        }
        else { 
            for(int i = curIndex ; i < a.length ; i++) { 
                swap(a , curIndex  , i )  ; 
                permutation(a, curIndex + 1);
                swap(a , curIndex , i) ; 
            }
        }
    }

     
}
