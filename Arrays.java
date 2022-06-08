package com.cashapona.Datatypes.Jun2;

	import java.util.Scanner;
	/**
	 * @author USER
	  */
	public class Arrays {
		/**
		 * @param args
		 */
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			int[] array=new int[5];
			int sum=0;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the elements");
			for(int i=0;i<5;i++) {
				array[i]=scanner.nextInt();
			}
			for(int num:array) {
				sum=sum+num;
			}
			System.out.println("sum : "+sum);
		}
	}

