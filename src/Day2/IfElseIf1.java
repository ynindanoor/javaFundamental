package Day2;

import java.util.Scanner;

public class IfElseIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub IF MAJEMUK contohnya nilai
		
		//nilai A = 90-100
		//nilai B = 85-89
		//nilai C = 75-84
		//nilai D < 75
		//nilai hanya dari 0-100
		Scanner input = new Scanner(System.in);
		
		int angka;
		System.out.println("Masukkan Nilai = ");
		angka = input.nextInt();
		if(angka>89 && angka<=100) 
		{
			System.out.println("Nilai A")};
		else if(angka>84 && angka<90)
		{
			System.out.println("Nilai B");}
		else if(angka>75 && angka<85) {
			System.out.println("Nilai C");}
		else if(angka<75) {
			System.out.println("Nilai D");}
		else(angka < 0 || angka > 100);
		{
			System.out.println("Tidak Valid");}
		
		
		
		

	}

}
