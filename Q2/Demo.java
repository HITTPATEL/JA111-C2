package C2.Q2;

import java.util.Scanner;

public class Demo {
     
	
	public static void main(String[] args) {
		  Scanner inputScanner=new Scanner(System.in);
		  System.out.println("Enter number of student object need to be created");
		  int number=inputScanner.nextInt();
		  Student [] arr=new Student[number];
		  
		  for(int i=0; i<arr.length; i++) {
			     System.out.println("Enter details of student number "+ (i+1));
			    inputScanner.nextLine();
			    System.out.println("Enter name of student :");
			    String nameString=inputScanner.nextLine();
			    
			    System.out.println("Enter roll number of student :");
			    int rollNumber=inputScanner.nextInt();
			    
			    System.out.println("Enter marks of student :");
			    int marks=inputScanner.nextInt();
			    
			    inputScanner.nextLine();
			    System.out.println("Enter address of student :");
			    String address=inputScanner.nextLine();
			    System.out.println("=========================");
			    arr[i]=new Student();
			    arr[i].setAddress(address);
			    arr[i].setRoll(rollNumber);
			    arr[i].setMarks(marks);
			    arr[i].setName(nameString);
			    
			    
			    
		  }
		  int sum=0;
		   for(int i=0; i<arr.length; i++) {
			   sum+=arr[i].getMarks();
			  System.out.println("=========================");
			    System.out.println("Name :"+arr[i].getName());
			    System.out.println("Address :"+arr[i].getAddress());
			    System.out.println("Roll number :"+arr[i].getRoll());
			    System.out.println("Marks :"+arr[i].getMarks());
		  }
		  int average=sum/arr.length;
		  System.out.println("==================");
		  System.out.println("Average of marks is "+average);
		   
		  
		
	}
}
