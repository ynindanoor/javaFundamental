package Day1;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Biodata
	// nama, umur, alamat
	Scanner input = new Scanner(System.in);
	
	String nama, alamat;
	int umur;
	
	System.out.print("Masukkan nama = ");
	nama=input.nextLine();
	System.out.print("Masukkan alamat = ");
	alamat=input.nextLine();
	System.out.print("Masukkan umur = ");
	umur=input.nextInt();
	
	System.out.println("----------------------------");
	System.out.println("Nama = "+nama);
	System.out.println("Umur = "+umur);
	System.out.println("Alamat = "+alamat);

	}

}

