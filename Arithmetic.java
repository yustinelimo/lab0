 
package Operations;



public class Arithmetic {
    

public Arithmetic(){//default constructor of the class arithmetic
    // used to initialize two variables
first_number=10;
second_number=5; 
    }
    private int first_number;//private data members
     private int second_number;//private modifier in variable declaration means cannot be accesed outside thi class i.e encapsulation

    public void setFirst_number(int first_number) {//two setters to allow
        //access of private value first_number. USED TO VALIDATE THE DATA BEFORE CHANGING THE OBJECT STATE 
        this.first_number = first_number;
    }

    public void setSecond_number(int second_number) {//two setters to
        //allow access of the value second_number
        this.second_number = second_number;
    }
  // 
    
   public int getfirst_number(){//two getters;:: USED TO FORMAT THE DATA BEFORE RETURNING THE OBJECT'S STATE. 
    return first_number; 
}
   public int getsecond_number(){//two getters
       return second_number;
   }
    public int sum(){//3 public methods sum,diff,product
              return first_number + second_number;//body, i.e what
              //computes
              
    }
    public int difference(){//method operate on objects internal state and act as a primary mechanism for object to object comms 
        //they work on data defined by a class
        return first_number - second_number;
}
     public int product(){//method 
        return first_number * second_number;
        
    }
    public Arithmetic(int first, int second){//constructor with a different signature 
    this.first_number= first;
    this.second_number= second;
    }
} 