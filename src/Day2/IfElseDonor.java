package Day2;

import java.util.Scanner;

public class IfElseDonor {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int umur, berat;
	System.out.print("Masukkan umur = ");
	umur=input.nextInt();
	System.out.print("Masukkan berat badan = ");
	berat=input.nextInt();
	
	if(umur>17 && umur<50 && berat>55)
	{
		System.out.println("Boleh mendonor");
	}

	else {System.out.println("Tidak boleh mendonor");}
	
}


//boleh mendonor
//tidak boleh mendonor karena usia
//tidak boleh mendonor karena berat
//tidak sesuai keduanya



//jumlah menginap = ... malam
//kelas : 1 = 100rb/malam, 2=50rb/malam
//dokter : A = 1jt, B = 2jt
//total bayar


}
