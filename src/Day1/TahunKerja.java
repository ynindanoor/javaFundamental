package Day1;

import java.util.Calendar;
import java.util.Scanner;

public class TahunKerja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		//Masukkan Nama =
				//Tahun Mulai Bekerja =
				//Berapa tahun dia bekerja sampai tahun sekarang =
				
				String nama;
				int kerja, lahir, usia;
				Calendar kalendar = Calendar.getInstance();
				int tahun_sekarang = kalendar.get(Calendar.YEAR);
				System.out.println(tahun_sekarang);
				
				System.out.print("Masukkan nama = ");
				nama=input.nextLine();
				System.out.print("Tahun Mulai Bekerja = ");
				kerja=input.nextInt();
				System.out.print("Tahun Lahir = ");
				lahir=input.nextInt();
				
				System.out.println("----------------------------");
				System.out.println("Nama = "+nama);
				System.out.println("Kerja = "+kerja+" tahun");
				System.out.println("Lama Bekerja = "+(tahun_sekarang-kerja)+" tahun");
				System.out.println("Usia = "+(tahun_sekarang-lahir)+" tahun");


	}

}

