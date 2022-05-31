package C2.Q3;

import javax.management.InstanceAlreadyExistsException;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h1=new HatchBack();
			h1.setNumberOfPassenger(numberOfPassenger);
		    h1.setNumberOfKms(numberOfKMs);
			return h1;
					
		}
		else {
		    Sedan s1=new Sedan();
		    s1.setNumberOfPassenger(numberOfPassenger);
		    s1.setNumberOfKms(numberOfKMs);
		    return s1;
		}
		
		
	}
	
	public int calculateBill(Car car) {
		
		 if (car instanceof HatchBack) {
			 HatchBack hatchBack= (HatchBack) car;
			 int numberOfKms=hatchBack.getNumberOfKms();
			 int farePerKm=hatchBack.farePerKm;
			 int totalFare=numberOfKms*farePerKm;
			 return totalFare;
		}
		 else if(car instanceof Sedan){
				Sedan sedan=(Sedan) car;
			 int numberOfKms=sedan.getNumberOfKms();
			 int farePerKm=sedan.farePerKm;
			 int totalFare=numberOfKms*farePerKm;
			 return totalFare;
		 }
		return 0;	
	}
}
