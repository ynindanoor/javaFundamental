package Day1;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nama, nama1, nama2;
		int usia, usia1, usia2;
		
		nama1="Java";
		usia1=27;
		nama2="Para Juara";
		usia2=20;
		
		System.out.println("Nama = "+nama1);
		System.out.println("Usia = "+usia1);
		System.out.println("Nama = "+nama2);
		System.out.println("Usia = "+usia2);
		
		System.out.print("Masukkan nama = ");
		nama=input.nextLine();
		System.out.print("Masukkan usia = ");
		usia=input.nextInt();
		
		System.out.println("----------------------------");
		System.out.println("Nama = "+nama);
		System.out.println("Umur = "+usia);
				
		
	}

}