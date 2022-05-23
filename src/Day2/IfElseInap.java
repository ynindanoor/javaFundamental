package Day2;

import java.util.Scanner;

public class IfElseInap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//jumlah menginap = ... malam
		//kelas : 1 = 100rb/malam, 2=50rb/malam
		//dokter : A = 1jt, B = 2jt
		//total bayar
		int inap, kelas, total;
		char dokter;
		System.out.print("Masukkan jumlah menginap = ");
		inap=input.nextInt();
		System.out.print("Masukkan kelas = ");
		kelas=input.nextInt();
		System.out.print("Masukkan dokter = ");
		dokter=input.next().charAt(0);
	
		if(kelas==1 && dokter=='A')
		{
			System.out.printf("Total pembayaran=%d", (inap*100000)+1000000);
		}
		else if(kelas==1 && dokter=='B')
		{
			System.out.printf("Total pembayaran=%d", (inap*100000)+2000000);
		}
		else if(kelas==2 && dokter=='A')
		{
			System.out.printf("Total pembayaran=%d", (inap*50000)+1000000);
		}
		else if(kelas==2 && dokter=='B')
		{
			System.out.printf("Total pembayaran=%d", (inap*50000)+2000000);
		}

		else {System.out.println("Masukkan kelas (1/2) dan dokter (A/B)");}
		
		

	}

}

