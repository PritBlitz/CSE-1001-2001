package DSA_Assignment_002;

import java.util.Scanner;

public class asmt_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter your name  : ");
        String name1 = sc.nextLine() ; 
        System.out.print("Enter your age : ");
        int age1 = sc.nextInt() ; 
        Person p1 = new Person() ; 
        p1.name = "Rohan" ; 
        p1.age = 20 ; 
        Person p2 = new Person() ;
        p2.setData(name1, age1);
        p2.displayData();
        p1.displayData();
        System.out.println(((p1.age == p2.age) ? "Both are of the same age ." : (p1.age > p2.age ?  p2.name : p1.name ) + " is Younger ."));
        sc.close();    
    }
}

class Person { 
    String name  ; 
    int age ; 
    void setData(String name , int age ) { 
        this.name = name  ; 
        this.age = age ; 
    }
    void displayData() { 
        System.out.println("Name : " + name ) ;
        System.out.println("Age : " + age );
    }
}
