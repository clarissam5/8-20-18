import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//calendar 

//isShopOpen = true;
//Date & Calendar
public class LearnDate {
	
	public static void main(String args[]) {
		//Today's date and time will be current time
		Date d = new Date ();
		//Miliseconds since midnight January 1st, 1970 
		System.out.println(d.getTime());
		
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("HH:MM");
		System.out.println(format.format(date));
		
	      System.out.println("toString(): " + date);  // dow mon dd hh:mm:ss zzz yyyy
	      
	      SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
	      System.out.println("Format 1:   " + dateFormatter.format(date));

	      dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Format 2:   " + dateFormatter.format(date));
	      
	      dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	      System.out.println("Format 3:   " + dateFormatter.format(date));
		
		Calendar cal = Calendar.getInstance();
	      // You cannot use Date class to extract individual Date fields
	      int year = cal.get(Calendar.YEAR);
	      int month = cal.get(Calendar.MONTH);      // 0 to 11
	      int day = cal.get(Calendar.DAY_OF_MONTH);
	      int hour = cal.get(Calendar.HOUR_OF_DAY);
	      int minute = cal.get(Calendar.MINUTE);
	      int second = cal.get(Calendar.SECOND);
	   
	      
	   }
		
	

}
