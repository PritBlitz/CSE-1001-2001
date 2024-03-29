package DSA_Assignment_002;

public class asmt_02_05 {
    public static void main(String[] args) {
        Employee e = new Employee("Pritish Biswas ", 19, 2232, 78327892.78328) ; 
        e.empDisplay(); 
        
    }
}

class Person1 { 
    String name ; 
    int age  ; 
    Person1(String name , int age ) { 
        this.age = age  ; 
        this.name  = name  ; 
    }
}

class Employee extends Person1 { 
    int Eid ; 
    double salary ; 
    Employee(String name , int age , int Eid , double salary ) { 
        super(name , age ) ; 
        this.Eid = Eid ; 
        this.salary = salary ; 
    }
    void empDisplay() { 
        System.out.println("Name : " + name ) ; 
        System.out.println("Age : " + age );
        System.out.println("Employee Id : " + Eid);
        System.out.println("Salary : " + salary);
    }

}
