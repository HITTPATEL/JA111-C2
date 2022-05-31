package C2.Q4;

public class Student extends Person {
	 int studentId;
	 String courseEnrolled; 
	 int courseFee;
	 
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
 + ", name=" + name + ", gender=" + gender + ", address="+", City :" + address.city+ ", State :"+address.state +", Pincode" +address.pinCode   + "]";
	}
	
	
	 

}
