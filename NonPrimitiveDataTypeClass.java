package com.cashapona.Datatypes.Jun2;

public class NonPrimitiveDataTypeClass { 
    
    // defining the variables of class  
    int a = 20;  
    int b = 10;  
    int c;  

    // defining the methods of class  
    public void add () {  
        int c = a + b;  
        System.out.println("Addition of numbers is: " + c);  
    }  

    public void sub () {  
        int c = a - b;  
        System.out.println("Subtraction of numbers is: " + c);  
    }  
  
// main method  
public static void main (String[] args) {  
    // creating the object of class  
	NonPrimitiveDataTypeClass obj = new NonPrimitiveDataTypeClass();  

    // calling the methods  
    obj.add();  
    obj.sub();  
}
}
