package Exam;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int angkaAwal = scan.nextInt();
		int angkaAkhir = scan.nextInt();
		int inputPenambahan = scan.nextInt();
		System.out.println("Deret aritmatika");
		for(int i = angkaAwal+1; angkaAwal < angkaAkhir; i++) {
			System.out.print(angkaAwal + " ");
			angkaAwal += inputPenambahan;

	}

}}
