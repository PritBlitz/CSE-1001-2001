package DSA_Assignment_002;

import java.util.Scanner;

public class asmt_02_03 {
    public static void main(String[] args) {
        Product[] p = new Product[5] ; 
        Scanner sc = new Scanner(System.in) ; 
        for(int i = 0 ; i < 5 ; i++ )  {
            System.out.print("Enter the Product Id for Product " + (i + 1) + " : ");
            String prodId = sc.next() ; 
            System.out.print("Enter the price for Product " + (i + 1) + " : ");
            int price = sc.nextInt() ; 
            System.out.print("Enter the quantity for Product " + (i + 1) + " : ");
            int quantity = sc.nextInt() ; 
            p[i] = new Product(prodId, price, quantity) ; 

        }

        System.out.println();

        for(int i = 0 ; i < p.length ; i++ ) { 
            p[i].display() ; 
        }

        System.out.println("Total Amount Payable : " + Product.totalPrice );
        sc.close();         
    }
    
}

class Product { 
    String prodId ; 
    int price ; 
    int quantity ; 
    static double totalPrice ; 

    Product(String prodId , int price , int quantity ) { 
        this.prodId = prodId ; 
        this.price = price ; 
        this.quantity = quantity ; 
        totalPrice = price * quantity ; 
    }

    void display() { 
        System.out.println("Product ID : " + prodId);
        System.out.println("Price : " + price);
        System.out.println("Quanitity : " + quantity);
    }

}
