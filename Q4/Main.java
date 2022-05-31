package C2.Q4;

import java.util.Scanner;

public class Main {
  
	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			 Scanner inputScanner=new Scanner(System.in);
			 System.out.println("Enter Name");
			 inputScanner.nextLine();
			 String nameString=inputScanner.nextLine();
			
			 System.out.println("Enter Gender");
			 String genderString=inputScanner.next(); 
			 
			 System.out.println("Enter Student ID ");
			 int studentId=inputScanner.nextInt();
			 
			 System.out.println("Enter course enrolled");
			 String courseEnrolled=inputScanner.next(); 
			 
			 System.out.println("Enter course fee");
			 int courseFee=inputScanner.nextInt();
			   
			   System.out.println("Enter City");
			   String city=inputScanner.next();
			   
			   inputScanner.nextLine();
			   System.out.println("Enter State");
			   String state=inputScanner.nextLine();
			   
			   System.out.println("Enter Pincode");
			   int pinCode=inputScanner.nextInt();
			 
			 Student student=(Student) person;
			 student.setName(nameString);
			 student.setGender(genderString);
			 student.setStudentId(studentId);
			 student.setCourseEnrolled(courseEnrolled);
			 student.setCourseFee(courseFee);
			 
			 Address address=new Address();
			 address.setCity(city);
			 address.setState(state);
			 address.setPinCode(pinCode);
			 
			 student.setAddress(address);
			 
			 return student;
		
		}
		else if(person instanceof Instructor) {
			Scanner inputScanner=new Scanner(System.in);
			
			 System.out.println("Enter Name");
			 inputScanner.nextLine();
			 String nameString=inputScanner.nextLine();
			
			 System.out.println("Enter Gender");
			 String genderString=inputScanner.next(); 
			 
			  System.out.println("Enter Instructor ID");
			   int instructorId=inputScanner.nextInt();
			   
			   System.out.println("Enter Salary");
			   int salary=inputScanner.nextInt();
			 
			  System.out.println("Enter City");
			   String city=inputScanner.next();
			   
			   inputScanner.nextLine();
			   System.out.println("Enter State");
			   String state=inputScanner.nextLine();
			   
			   System.out.println("Enter Pincode");
			   int pinCode=inputScanner.nextInt();
			   
			   
			   Address address=new Address();
				 address.setCity(city);
				 address.setState(state);
				 address.setPinCode(pinCode);
				 
				 Instructor instructor=(Instructor) person;
				 instructor.setName(nameString);
				 instructor.setGender(genderString);
				 instructor.setInstructorId(instructorId);
				 instructor.setSalary(salary);
				 instructor.setAddress(address);
				 
				 return instructor;
		}
		
		return null;
	
	}
	public static void main(String[] args) {
  
//		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

//		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}
