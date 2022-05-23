package Day1;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
	//Input Nilai 95,5
	//Input Predikat A
	double nilai;
	char predikat;
	
		System.out.print("Masukkan Nilai = ");
		nilai=input.nextDouble();
		System.out.print("Masukan Predikat = ");
		predikat=input.next().charAt(0);
		
		System.out.println("----------------------------");
		System.out.println("Nilai = "+nilai);
		System.out.println("Predikat = "+predikat);

	}

}