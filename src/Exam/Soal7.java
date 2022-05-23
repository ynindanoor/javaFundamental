package Exam;

import java.util.Scanner;

public class Soal7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double angka= scan.nextDouble();
		double loop= scan.nextDouble();
		
		for(int i = 1; i <=loop - 1; i++) {
			System.out.print(Math.pow(angka, i)+" ");
		}
	}

}
