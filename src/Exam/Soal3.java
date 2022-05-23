package Exam;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String Teks;
		int TeksAwal, TeksAkhir;
		Teks = scan.next();
		TeksAwal = scan.nextInt();
		TeksAkhir = scan.nextInt();
		
		System.out.println(Teks.substring(TeksAwal, TeksAkhir));

	}

}
