package C2.Q4;

public class Instructor extends Person {
      int instructorId;
      int salary;
      
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + ", address=" +", City :" + address.city+ ", State :"+address.state +", Pincode"+address.pinCode+  "]";
	}
      
   
}
