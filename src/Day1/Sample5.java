package Day1;

public class Sample5 {
	public static void main(String[] args) {
		int i = 123;
		long j = i;
		
		char huruf = 'W';
		int angka = huruf;
		
		float data = 123.4f;
		double data2 = data;
		
		System.out.println(j);
		System.out.println(angka);
		System.out.println(data2);
		
		int bil = 10;
		double bil2 = bil;
		System.out.println(bil2);
		
		float saldoAkhir = 10000.99f;
		int saldoAkhirBulat = (int) saldoAkhir;
		System.out.println(saldoAkhirBulat);
		
		float jarak = 100;
		float waktu = 10;
		
		float kecepatan = jarak/waktu;
		double skala = kecepatan;
	}
	

	

}
