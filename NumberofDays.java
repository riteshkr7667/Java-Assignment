import java.util.Date;
public class NumberofDays {

	

		public static void main(String[] args) {
			
			int birthYear =  1998;
			int birthMonth = 9;
			int birthDay = 14;
			
	        // Get current date
	      
			Date currentDate = new Date();
			
			   // Set birth date
			
			Date birthDate = new Date(birthYear-1900, birthMonth-1, birthDay);
			
			 // Set birth date to current year
			
			birthDate.setYear(currentDate.getYear());
			long t1=currentDate.getTime();
			long t2= birthDate.getTime();
			
			 long remainingTime = t2-t1;
		        long remainingDays = remainingTime / (24 * 60 * 60 * 1000);

		        // Print remaining days
		        System.out.println("Remaining days until birth date: " + remainingDays);
		       


			

		}

}
