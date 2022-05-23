package Day2;

import java.util.Calendar;
import java.util.Scanner;

public class IfElsePlat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int tanggal, plat;
		System.out.print("Masukkan tanggal = ");
		tanggal=input.nextInt();
		System.out.print("Masukkan plat nomor = ");
		plat=input.nextInt();
		
		if(tanggal%2==0 && plat%2==0) 
		{
			System.out.println("Tidak melanggar");
		}
		
		else if(tanggal%2==1 && plat%2==1) 
		{
			System.out.println("Tidak melanggar");
		}
		else {System.out.println("Dilarang masuk");}}}
