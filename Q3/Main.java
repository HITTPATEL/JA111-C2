package C2.Q3;

import java.util.Scanner;

public class Main {
      
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter Number of passengers :");
		int numberOfPassenger=inputScanner.nextInt();
		
		System.out.println("Enter Number of Kms");
		int numberOfKms=inputScanner.nextInt();
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is "+ res);
	}
}
