package DSA_Assignment_002;

public class asmt_02_07 {
    public static void main(String[] args) {
        Person4 p = new Person4("Pritish") ; 
        p.count(); 
        p.display();
        
    }
}

interface DetailInfo { 
    void display() ; 
    void count() ; 

}

class Person4 implements DetailInfo { 
    static int maxcount  ; 
    String name ; 
    Person4(String name) {
        this.name = name ; 
    }
    public void count() { 
        maxcount = this.name.length() ; 
    }
    public void display() { 
        System.out.println("Name : " + name );
        System.out.println("Number of characters present : " + maxcount);
    }

}
