package com.ques1;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Passengers : ");
		c.setNumberOfPassengers(sc.nextInt());
		System.out.println("Enter no of Kms : ");
		c.setNumberOfKms(sc.nextInt());
		
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(c.getNumberOfPassengers(), c.getNumberOfKms());
		int res = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is"+" "+ res);
	}

}
