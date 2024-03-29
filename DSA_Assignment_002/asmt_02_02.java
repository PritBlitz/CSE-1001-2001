package DSA_Assignment_002;

import java.util.Scanner;

public class asmt_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the real and imaginary part of the first number : ");
        double real1  = sc.nextDouble() ; 
        double imag1 = sc.nextDouble() ; 
        System.out.println("Enter the real and imaginary part of the second number : ");
        double real2 = sc.nextDouble() ; 
        double imag2 = sc.nextDouble() ; 
        Complex c1 = new Complex() ; 
        Complex c2 = new Complex() ; 
        c1.setData(real1, imag1);
        c2.setData(real2, imag2);
        Complex c3 = c1.add(c1, c2) ; 
        System.out.println("Addition of two Complex Numbers : ");
        c3.display();
        sc.close(); 
        
    }
}

class Complex { 
    double real ; 
    double imag ; 
    void setData(double real , double imag ) { 
        this.real = real ; 
        this.imag = imag ; 
    }
    void display() { 
        System.out.println(real + " + (" + imag + ")i" );
    }
    public Complex add(Complex a1 , Complex a2) { 
        Complex sum = new Complex() ; 
        sum.real = a1.real + a2.real ; 
        sum.imag = a1.imag + a2.imag ; 
        return sum ; 
    }
}
