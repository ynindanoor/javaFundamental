package Day2;

import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hari = 8;
		switch (hari) {
		case 1:
			System.out.println("Senin");
			break;
		case 2:
			System.out.println("Selasa");
			break;
		case 3:
			System.out.println("Rabu");
			break;
		case 4:
			System.out.println("Kamis");
			break;
		case 5:
			System.out.println("Jumat");
			break;
		case 6:
			System.out.println("Sabtu");
			break;
		case 7:
			System.out.println("Minggu");
			break;
		default:
			System.out.println("Tidak ada hari tersebut");
			break;
		}
		
		String browser;
		System.out.println("Input nama browser: ");
		browser = input.next();
		String pilihBrowser = browser.toLowerCase();
		switch (pilihBrowser) {
		case "firefox":
			System.out.println("Open Firefox");
			break;
		case "chrome":
			System.out.println("Open Chrome");
			break;
		default:
			System.out.println("Tidak ada browser lain");
			break;
			
	// membutuhkan operator pembanding --- menggunakan IF ELSE
	// case yang tidak memerlukan operator pembanding --- case sensitif, unik, tidak boleh sama antara case 1 dan lainnya --- menggunakan SWITCH CASE
		
	}
		
		char huruf = 'A';
		switch (huruf) {
		case 'Z' :
			System.out.println("Huruf vokal");
			break;
		case 'I' :
			System.out.println("Huruf vokal");
			break;
		case 'U' :
			System.out.println("Huruf vokal");
			break;
		case 'E' :
			System.out.println("Huruf vokal");
			break;
		case 'O' :
			System.out.println("Huruf vokal");
			break;
		default:
			System.out.println("Huruf konsonan");
			break;
		}

		
		//rumus bangun datar
		//1. Persegi: sisi
		//2. Persegi panjang : panjang, lebar
		//3. Segitiga : alas, tinggi
		
		System.out.println("Rumus Luas Bangun Datar");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi panjang");
		System.out.println("3. Segitiga");
		int bangun, sisi, lebar, panjang, alas, tinggi;
		
		System.out.println("Masukkan nomor 1-3");
		bangun = input.nextInt();
		switch (bangun) {
		case 1 :
			System.out.println("Masukkan sisi");
			sisi=input.nextInt();
			System.out.println("Luas Persegi = s x s = "+ sisi*sisi);
			break;
		case 2 :
			System.out.println("Masukkan lebar dan panjang");
			System.out.println("Masukkan lebar");
			lebar=input.nextInt();
			System.out.println("Masukkan panjang");
			panjang=input.nextInt();
			System.out.println("Luas Persegi Panjang = p x l = "+ panjang*lebar);
			break;
		case 3 :
			System.out.println("Masukkan alas dan tinggi");
			System.out.println("Masukkan alas");
			alas=input.nextInt();
			System.out.println("Masukkan tinggi");
			tinggi=input.nextInt();
			System.out.println("Luas Segitiga = (a x t)/2  = "+ (alas*tinggi)/2);
			break;
		default:
			System.out.println("Bukan bangun yang disediakan");
			break;
	}
		
	
	// input kelas
	// input jam
	// kelas 1A, jam 9 = Statistik, jam 10 = pemrogram java
	// kelas 1B, jam 9 = Bahasa Indonesia, jam 10 = praktikum java
		String kelas;
		int jam;
		System.out.println("Input Kelas : ");
		kelas=input.next();
		System.out.println("Input Jam");
		jam=input.nextInt();
		
		switch (kelas) {
		case "1A" :
			switch (jam) {
			case 9 :
			System.out.println("Jadwal Kelas 1A Jam 9 = Statistika");
			break;
			case 10 :
				System.out.println("Jadwal Kelas 1A Jam 10 = Pemrogram Java");
				break;
			default:
				System.out.println("Tidak ada jadwal");
				break;}
			break;
		case "1B" :
			switch (jam) {
			case 9 :
			System.out.println("Jadwal Kelas 1B Jam 9 = Bahasa Indonesia");
			break;
			case 10 :
			System.out.println("Jadwal Kelas 1B Jam 10 = Praktikum Java");
					break;
			default:
					System.out.println("Tidak ada jadwal");
					break;}
			break;		
		default:
			System.out.println("Tidak ada jadwal");
				break;
		
		
		
		
	}}}

