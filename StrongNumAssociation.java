package com.jsp.inheritance;
import java.util.Scanner;

class Factorial
{
	public long factor(long num)
	{
		int fact=1;
		for (int i=1;i<=num;i++)fact=fact*i;
		return fact;
	}
}
class StrongNum
{
	public long Strong(long num) 
	{
		Factorial f =new Factorial ();
		long res=0;
		for(;num>0;num/=10) res=res+f.factor(num%10);
		return res;
	}
	
}

public class StrongNumAssociation 
{
   public static void main(String[] args) 
   {
	Scanner keyboard =new Scanner(System.in);
	System.out.println("Enter a number");
	long num=keyboard.nextLong();
	
	StrongNum s= new StrongNum();
	long result= s.Strong(num);
	
	if(num==result) System.out.println("strong");
	else System.out.println("not a Strong number");
	
	
	
	
   }		
}
