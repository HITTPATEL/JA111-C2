package C2.Q3;

import javax.management.InstanceAlreadyExistsException;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h1=new HatchBack();
			h1.setNumberOfPassenger(numberOfPassenger);
		    h1.getNumberOfKms();
		    h1.setNumberOfKms(numberOfKMs);
		    h1.getNumberOfPassenger();
	
			return h1;
					
		}
		else {
		    Sedan s1=new Sedan();
		    s1.setNumberOfPassenger(numberOfPassenger);
		    s1.getNumberOfPassenger();
		    s1.setNumberOfKms(numberOfKMs);
		    s1.getNumberOfPassenger();
		    return s1;
		}
		
		
	}
	
	public int calculateBill(Car car) {
		
		Sedan sedan=new Sedan();
		HatchBack hatchBack=new HatchBack();
		
		int numberOfKms=car.getNumberOfKms();
		
		 if (car instanceof HatchBack) {
			 int farePerKm=hatchBack.farePerKm;
			 int totalFare=numberOfKms*farePerKm;
			 return totalFare;
		}
		 else if(car instanceof Sedan){
			 int farePerKm=sedan.farePerKm;
			 int totalFare=numberOfKms*farePerKm;
			 return totalFare;
		 }
		return 0;
		
		
	
		
		
	}
}
