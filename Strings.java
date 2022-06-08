package com.cashapona.Datatypes.Jun2;

public class Strings {
	public static void main(String[] args) {
		// string object created by using constructor of string.
		// strings are immutable in java.
		String s1=new String("venkatateja");
		String s2=new String("venkatateja");
		String s3=new String("vallepu");
		// string object created by using string literal
		String s="teja";
		
		//String methods
		
		//1. concat() value is not assigning to any object, so automatically it is removed by Garbage collector 
		s.concat(s1);
		System.out.println("After concatination not assigning to any variable : "+s);
		s=s.concat(s1);
		System.out.println("After concatination ,assigning to variable : "+s);
		
		//2. str==str1 Referencce comparision only
		System.out.println("String str==str2  : "+(s==s2));   
		System.out.println("String str==str3  : "+(s==s3));
		System.out.println("String str==str1  : "+(s==s1));
		
		//3.str.equals(str1) refers content comparision
		System.out.println(" In Strings , equals() method is for comparision of two strings : " +(s1.equals(s2)));
		System.out.println("String s1.equals(s)  : "+(s1.equals(s)));
		
		//4.charAt(posi), 
		System.out.println("String s : "+s);
		System.out.println("charAt() , display 3rd position in s : "+s.charAt(3));

		//5.trim(), removes blank spaces
		String string=" venkata teja ";
		System.out.println("Removes blank spaces : "+string.trim());
		
		//6.length(), it prints length of a string
		System.out.println("length() returns length of string  : "+string.length()); 
		
		//7.trim().length() returns length of stirng with spaces remove first and end spaces
		System.out.println("trim().length() returns length of string with spaces removes first and end space : "+string.trim().length()); //after removing first & end spaces,print length of string as 9 

		//8.isEmpty, if string empty prints true otherwise false
		String string1="";
		System.out.println("Check whether the string is empty or not : "+string1.isEmpty());
		
		//9.replace(old value,new value) , replace old value with new value
		System.out.println("String : "+string);
		System.out.println("in string replace anu with aasha : "+string.replace("anu","aasha"));
		
		//10.substring(start index,end index), form new string from 2nd charactor to 5th 
		System.out.println("substring(2,5) : "+string.substring(2,5));

		//11.contains, prints boolean value
		System.out.println("contains(teja) : "+string.contains("teja"));

		//12.toUpperCase(), converts lower case letters to uppercase
		System.out.println();
		System.out.println("string : "+string);
		System.out.println("toUpperCase() : "+string.toUpperCase());
		}
	}


