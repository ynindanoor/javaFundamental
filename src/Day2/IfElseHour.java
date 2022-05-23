package Day2;

import java.util.Calendar;

public class IfElseHour{
	public static void main(String[] args) {
		
		
		//
	Calendar time = Calendar.getInstance();
	int hour = time.get(Calendar.HOUR_OF_DAY);
	 System.out.println("Sekarang jam = "+hour);
	 
	 if((hour >= 0) && (hour<=12)) {
	System.out.println("Selamat pagi");}
	 else if((hour >= 13) && (hour<=16)) {
	System.out.println("Selamat siang");}
	 else if((hour >= 17) && (hour<=18)) {
	System.out.println("Selamat sore");}
	 else {
	System.out.println("Selamat malam");}
	 
		 
	}

}
