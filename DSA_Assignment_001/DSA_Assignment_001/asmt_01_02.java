package DSA_Assignment_001;

import java.util.Scanner;

public class asmt_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter person weight in kg : ");
        double w = sc.nextDouble() ; 
        System.out.print("Enter height of person in meter : ");
        double h = sc.nextDouble() ; 
        double bmi = w / Math.pow(h, 2) ; 
        System.out.print("The person is ");
        if (bmi < 18.5) {
            System.out.println("Underweight ") ; 
        }
        else if(bmi >= 18.5 && bmi < 25) { 
            System.out.println("Normal Weight ");
        }
        else if(bmi >= 25 && bmi < 30) { 
            System.out.println("Overweight ");
        }
        else { 
            System.out.println("Obese ");
        }
        sc.close(); 
    }
}
