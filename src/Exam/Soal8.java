package Exam;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int angka = scan.nextInt();
		for(int i = 1; i < angka; i++) {
			for(int j = 1; j <= angka; j++) {
				if(j==1) {
					System.out.println(i);
					
				}else {
					
				System.out.println("Text Print");
			}
		}
		

	}

}}
