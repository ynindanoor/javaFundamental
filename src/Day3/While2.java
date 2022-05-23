package Day3;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String password = "nexsoft";
		int maxInput = 3, percobaan=0;
		boolean sesuai = true;
		System.out.println("Silakan Login!");
		
		
		do {
			System.out.println("Masukkan password : ");
			String inputPassword = input.nextLine();
			if(inputPassword.equals(password)) {
				System.out.println("Selamat Berhasil Masuk");
				break;
			} else if (!inputPassword.equals(password)) {
				percobaan+=1;
				System.out.println("Coba Lagi maksimal 3x");
				if(percobaan==maxInput) {
					System.out.println("Gagal Masuk");
					sesuai = false;
				}
			}
		} while(sesuai);
	}}
//springboot?
//postman

