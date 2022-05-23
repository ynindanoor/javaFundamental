package Day2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Format{
	
	public static void main(String[] args) {
		double total = 1000000000;
		System.out.println(total);
		
		DecimalFormat formatRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols simbolRupiah = new DecimalFormatSymbols();
		
		simbolRupiah.setCurrencySymbol("Rp. ");
		simbolRupiah.setMonetaryDecimalSeparator('.');
		simbolRupiah.setGroupingSeparator('.');
		
		formatRupiah.setDecimalFormatSymbols(simbolRupiah);
		System.out.println(formatRupiah.format(total));
		
		NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(formatDolar.format(total));
		
		NumberFormat formatJepang = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(formatJepang.format(total));
		
		if(total >= 100000) {
			System.out.println("Mendapatkan Kupon");
		} else {
			System.out.println("Belum Mendapatkan Kupon");
		}
		
		int x = 80;
		String a = "Nexsoft Juara", b="BootCamp";
		System.out.printf("%-15s%-15s%03d",a,b,x);
		
		
	}

}

