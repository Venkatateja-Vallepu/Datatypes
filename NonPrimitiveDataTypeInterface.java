package com.cashapona.Datatypes.Jun2;
interface Calculation { 
	void add();
    void multiply();  
    void divide();
    void subtrction();
    
}  
public class NonPrimitiveDataTypeInterface {        
        // defining the variables of class  
        int a = 10;  
        int b = 20;  
        int c;  
  
        // implementing the interface methods
        public void add() {
        	int c=a+b;
        	System.out.println("add of numbers is: " + c);
        }
        public void multiply() {  
            int c = a * b;  
            System.out.println("Multiplication of numbers is: " + c);  
        }  
        public void divide() {  
            int c = a / b;  
            System.out.println("Division of numbers is: " + c);  
        }
        public void subtraction(){
        	int c=a-b;
        	System.out.println("subtraction of numbers is: " + c);	
        }
    // main method  
    public static void main (String[] args) { 
    	NonPrimitiveDataTypeInterface obj = new NonPrimitiveDataTypeInterface();  
        // calling the methods
    	obj.add();
        obj.multiply();  
        obj.divide();  
        obj.subtraction();
    }
}

