/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

/**
 *
 * @author lenovo
 */
public class calculator extends Arithmetic {
    public int sub;
    @Override//polymorphism present same interface for different underlying forms
    
    public int difference(){
        
        if(getfirst_number()>getsecond_number());{
            sub= getfirst_number() - getsecond_number();
            return getfirst_number() - getsecond_number();
        }
    }

    
    @Override
    public int product(){
        return 0; 
}
    @Override
    public int sum(){
        return 0;
        
    }
}
    

