package Exam;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int angka, loop;
		angka = scan.nextInt();
		loop = scan.nextInt();
		
		for(int i = 1; i <= loop; i++) {
			System.out.println(angka + " x " + i + " = " + angka*i);
		}
	}

}
