package DSA_Assignment_002;

public class asmt_02_06 {
    public static void main(String[] args) {
        CSE cse = new CSE(90 , 95 , 80 ) ; 
		System.out.println("Percentage Obtained by CSE Student : " + cse.getPercentage());
		NonCSE ncse = new NonCSE(92 , 90 , 81) ; 
		System.out.println("Percentage Obtained by Non-CSE Student : " + ncse.getPercentage());
        
    }
    
}

abstract class Marks {
    int markICP ; 
    int markDSA ; 
    double percentage ; 

    abstract double getPercentage() ;
}

class CSE extends Marks { 
    int algoDesign ; 

    CSE(int markICP , int markDSA , int algoDesign) {
        super.markICP = markICP ; 
        super.markDSA = markDSA ;  
        this.algoDesign = algoDesign ; 
    }
    double getPercentage() { 
        percentage = (markICP + markDSA + algoDesign) / 3 ; 
        return percentage ; 

    }

}

class NonCSE extends Marks { 
    int enggMechanics ; 
    NonCSE(int markICP , int markDSA , int enggMechanics ) { 
        super.markICP =  markICP ; 
        super.markDSA = markDSA ; 
        this.enggMechanics = enggMechanics ; 
    }
    double getPercentage() { 
        percentage = (markICP + markDSA + enggMechanics ) / 3 ; 
        return percentage ; 
    }

}
