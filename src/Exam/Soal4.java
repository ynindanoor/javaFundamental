package Exam;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int inputAngka = scan.nextInt();
		int k = 0;
		for(int i = inputAngka; i > 0; i--) {
			k++;
			for(int j = inputAngka; j+1 > k; j--) {
				if (j % 3 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();

	}

	}}
