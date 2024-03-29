package DSA_Assignment_002;

public class asmt_02_04 {
    public static void main(String[] args) {
        Deposit d = new Deposit() ; 
        d.display() ; 

        
    }    
}

class Deposit { 
    long Principle ; 
    int Time ; 
    double Rate ; 
    double TotalAmt ; 

    Deposit() {
        Principle = 5000 ; 
        Time = 5 ; 
        Rate = 5 ;  

    }

    Deposit(long Principle , int Time , double Rate ) { 
        this.Principle = Principle ; 
        this.Time = Time ; 
        this.Rate = Rate ; 

    }

    Deposit(long Principle , int Time ) { 
        this.Principle = Principle ; 
        this.Time = Time ; 
        Rate = 7.2 ; 
    }

    Deposit(long Principle , double Rate ) { 
        this.Principle = Principle ; 
        this.Rate = Rate ;
        Time = 5 ;  
    }

    void display() { 
        System.out.println("Principle : " + Principle );
        System.out.println("Time :  " + Time );
        System.out.println("Rate : " + Rate );
    }

    double calcAmt() { 
        TotalAmt = Principle + ((Principle * Rate * Time) / 100 ) ; 
        return TotalAmt ; 
    }
}
