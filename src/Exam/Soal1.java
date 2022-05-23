package Exam;

import java.util.Scanner;
public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		double inputHarga1 = 0;
		double inputHarga2 = 0;

		System.out.print("Harga 1 : ");
		inputHarga1 = scan.nextDouble();
		System.out.print("Harga 2 : ");
		inputHarga2 = scan.nextDouble();
					    
		inputHarga1 = (int)inputHarga1;
		inputHarga2 = (int)inputHarga2;
		
		System.out.printf("Harga 1 : %.0f\n", inputHarga1);
		System.out.printf("Harga 2 : %.0f", inputHarga2);
		
		
		
	}

}
