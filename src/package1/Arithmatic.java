package package1;

import package1.Arithmatic;


public class Arithmatic { 

	//static int sumVal = 0;
		public int Sum(int i,int j)
		{
			
			int sumVal=i+j;
			System.out.println("Sum of the 2 variables: " +sumVal);
			return sumVal;
		}
		
		
		public int Sub(int sumVal,int j)
		{
			
			int subVal=sumVal-j;
			System.out.println("Subraction of the 2 variables: " +subVal);
			return subVal;
		}
		
		public int Multi(int sumVal,int subVal)
		{
			
			int multiVal=sumVal*subVal;
			System.out.println("Multiplication of the 2 variables: " +multiVal);
			return multiVal;
		}
		
		public int div(int multiVal,int sumVal)
		{
			
			int divVal=multiVal/sumVal;
			System.out.println("Division of the 2 variables: " +divVal);
			return divVal;
		}

		public static void main(String[] args) 
		{
			Arithmatic arithmath=new Arithmatic();
			System.out.println("--------------Assignment 1 result--------------");
			int sumVal=arithmath.Sum(10, 2);
			int sumVal2=arithmath.Sum(sumVal, 2);
			System.out.println("---------------------");
			int subVal=arithmath.Sub(sumVal2, 2);
			int subVal1=arithmath.Sub(10, 2);
			System.out.println("---------------------");		
			int multiVal=arithmath.Multi(sumVal, 2);	
			int multiVal1=arithmath.Multi(sumVal, subVal1);
			System.out.println("---------------------");
			int divVal1=arithmath.div(multiVal, 2);
			int divVal=arithmath.div(multiVal1,sumVal );
			
			
			
			System.out.println("****************************************");
			
			System.out.println("--------------Assignment 2 result--------------");
			int division=arithmath.div(10, 2);
			int substract=arithmath.Sub(division, 2);
			int sum=arithmath.Sum(substract, 2);
			int substract1=arithmath.Sub(sum, 2);
			int multiply=arithmath.Multi(substract1, 2);
			
			
			
		}



}
