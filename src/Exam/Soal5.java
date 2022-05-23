package Exam;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int baris = 5, k = 0;
		
				for (int i = 1; i <= baris; ++i, k = 0) {
					for (int spasi = 1; spasi <= baris - i; ++spasi) {
						System.out.print("  ");
			      }
					while (k != 2 * i - 1) {
						System.out.print("*");
						++k;
						}
			      System.out.println();
				}

	}

}
