package Day3;
import java.util.Scanner;
public class SampleLooping1 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	/*int nilaiAwal, nilaiAkhir;
	System.out.println("Masukkan Nilai Awal = ");
	nilaiAwal=input.nextInt();
	System.out.println("Masukkan Nilai Akhir = ");
	nilaiAkhir=input.nextInt();
	
	for(int i=nilaiAwal;i<=nilaiAkhir;i++) {
		System.out.println(i);
	}
	
	for(int i=nilaiAkhir;i>=nilaiAwal;i--) {
		System.out.println(i);
}
	int batas =1;
	String motor[] = new String[10];
	System.out.println("Masukkan data motor : ");
	for(int i=0; i<=batas;i++) {
		motor[i] = input.next();
		
	}
	for(String i : motor) {
		System.out.println(i);
	}
	
	int batas =3;
	String motor[] = new String[batas];
	System.out.println("Masukkan data motor : ");
	for(int i=0; i<motor.length;i++) {
		motor[i] = input.next();
		
	}
	for(String i : motor) {
		System.out.println(i);
	}
	
	//Nilai = 70,80,75,90
	int batasnilai =4;
	int nilai[] = new int[batasnilai];
	System.out.println("Masukkan Nilai : ");
	for(int i=0; i<nilai.length;i++) {
		nilai[i] = input.nextInt();
		
	}
	int sum = 0;
	for(int i : nilai) {
		System.out.println(i);
		sum +=i;		
}
	System.out.println("Jumlah Nilai = "+sum);
	
	int nilai1 = 80, nilai2 = 80;
	System.out.println("Sum = "+Integer.sum(nilai1,nilai2));
	*/
	
	//Bilangan ganjil 10-100, berapa jumlahnya
	//Bilangan yang habis dibagi 3, berapa jumlahnya
	//Tampilkan bilangan yang habis dibagi 3 dan 7
	//1 * 3 * 5 * 7 * 9 
	
	for (int i = 1; i<10; i++) {
	if (i%2==0)
		System.out.print(" * ");
	  else System.out.print(" "+i+" "); 
	
	
	}}}
