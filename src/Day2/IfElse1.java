package Day2;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Jika number >2 maka rumus dijalankan
	Scanner input = new Scanner(System.in);
	int num = 4;
	if(num>2) {
		int x = 10*num-2;
		System.out.println("x = "+x);
	}
	
	String kata1 = "Nexsoft";
	String kata2 = "nexsoft";
	if(kata1.equalsIgnoreCase(kata2)) {
		System.out.println("Kata sama");
	}
	
	// penggunaan Integer agar bisa dimanipulasi
	Integer num1 = 10;
	Integer num2 = 10;
	if(num1.equals(num2)) {
		System.out.println("Angka sama");
	}
	
	//pilih firefox
	//jalankan firefox
	String inputBrowser;
	String browser = "Firefox";
	System.out.println("Masukkan nama browser = ");
	inputBrowser = input.next();
	if(inputBrowser.equalsIgnoreCase(browser)) {
		System.out.println("Jalankan browser firefox");
	}
	
	int angka = 100;
	System.out.println("Angka = "+angka);
	if(angka%2==0) {
		System.out.println("Bilangan Genap");}
	else {System.out.println("Bilangan Ganjil");
	}
	
	//Contoh case :
	//gunakan scanner untuk input eror atau tidak
	//jika eror maka screenshot error
	
	//nilai ABCDE
	//vaksin -- jika belum 3x vaksin tdk bisa masuk mall
	//login
	
	

}}
