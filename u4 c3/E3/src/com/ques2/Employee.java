package com.ques2;
import java.util.Scanner;

public class Employee {
	
	double calculateAverageage(int[] age) {
		
		int len = age.length;
		double sum=0;
		for(var i=0; i<len; i++)
		{
			sum+=age[i];
		}
		double avg=sum/len;
		return avg;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee();
		
		System.out.println("Enter total no of employees");
		int n=sc.nextInt();
		
		int flag=0;
		
		if(n>1)
		{
			int[] age=new int[n];
			
			System.out.println("Enter the age for "+n+" employees :");
			
			
			for(var i=0; i<n; i++)
			{
				int count=sc.nextInt();
				if(count>1)
				{
					age[i]=count;
				}
				else 
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("The average age is : "+obj.calculateAverageage(age));
				
			}
			
		}
		else 
		{
			System.out.println("please enter a valid employee count");
		}
	}

}

