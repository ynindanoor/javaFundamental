package Day3;
import java.util.Scanner;
public class While {
	//tidak dapat diperhitungkan -- uncounted looping
	public static void main(String[] args) {
		int x = 0, n=5;
		while(x < n) {
			System.out.println(x);
			x++; //cek dulu kondisinya baru dilakukan perulangan
		}
		
		int y = 0;
		do {
			System.out.println(y);
			y++;
		} while (y < n);
	//Masukkan angka sesukanya
	//jika input 0 maka berhenti
		
	Scanner input = new Scanner (System.in);
	/*int angka;
	System.out.println("Masukkan angka sesukanya : ");
	angka = input.nextInt();
	int sum =0;
	while(angka>=0) {
		sum += angka;
		angka = input.nextInt();
		
	}
	System.out.println("Jumlah : "+sum);
	input.close();*/
	
	String jawab;
	boolean jawaban = true;
	int hitung = 0;
	while(jawaban) {
        System.out.println("Apakah anda ingin close program?");
        System.out.print("Jawab [ya/tidak]?");

        jawab = input.nextLine();

        if( jawab.equalsIgnoreCase("ya") ){
            jawaban = false;
            System.out.println("Program berhenti");
        }
        hitung++;


    }
	System.out.println("Hitung perulangan = "+hitung+" kali");
}
}
