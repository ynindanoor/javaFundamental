package Day3;
import java.util.Scanner;
public class Exam1 {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
		        /*
			    double inputAngka1 = 0;
			    double inputAngka2 = 0;

			    System.out.print("Angka 1 : ");
			    inputAngka1 = scan.nextDouble();
			    System.out.print("Angka 2 : ");
			    inputAngka2 = scan.nextDouble();
			    
			    inputAngka1 = (int)inputAngka1;
			    System.out.printf("Harga 1 : %.0f", inputAngka1);
			    inputAngka2 = (int)inputAngka2;
			    System.out.printf("\nHarga 2 : %.0f", inputAngka2);
			    */
				
				
				
				
				
				
				
				/*
				int inputAngka = 0, hasil1, hasil2;

			    inputAngka = scan.nextInt();
			    
			    hasil1 = inputAngka + 3;
			    hasil2 = hasil1 * 3;
			    
			    System.out.println(hasil1);
			    System.out.println(hasil2);
			    */
				
				
				
				
				
				/*
				String inputKata;
				int inputAwal, inputAkhir;
				
				inputKata = scan.next();
				inputAwal = scan.nextInt();
				inputAkhir = scan.nextInt();
				
				System.out.println(inputKata.substring(inputAwal, inputAkhir));
				*/
				
				
				
				
				
				
				/*
				int inputAngka = scan.nextInt();
				int k = 0;
				for(int i = inputAngka; i > 0; i--) {
					k++;
					for(int j = inputAngka; j+1 > k; j--) {
						if (j % 3 == 0) {
							System.out.print("*");
						}
						else {
							System.out.print(j);
						}
					}
					System.out.println();
					*/
				
				
				
				
				
//				int baris = 5, k = 0;
//		
//				for (int i = 1; i <= baris; ++i, k = 0) {
//					for (int spasi = 1; spasi <= baris - i; ++spasi) {
//						System.out.print("  ");
//			      }
//					while (k != 2 * i - 1) {
//						System.out.print("*");
//						++k;
//						}
//			      System.out.println();
//				}
				
				
				
				
				
				/*
				int hasil = 0;
				
				System.out.println("Masukkan angka : ");
				int inputAngka1 = scan.nextInt();
				int inputJumlahDeret = scan.nextInt();
				
				for(int i = 1; i <= inputJumlahDeret; i++) {
					hasil = inputAngka1 * i;
					System.out.println(inputAngka1 + " x " + i + " = " + hasil);
				}
				*/
				
				
				
				
				
				
				/*
				int inputAngka1 = scan.nextInt();
				int inputJumlahDeret = scan.nextInt();
				double hasil = 0.0;
				
				for(int i = 0; i <= inputJumlahDeret - 1; i++) {
					hasil = Math.pow(inputAngka1, 1+i);
					System.out.println(hasil);
				}
				*/
				
				
				
				
				
				/*
				int inputJumlahDeret = scan.nextInt();
				for(int i = 1; i <= inputJumlahDeret - 1; i++) {
					System.out.println(i);
					for(int j = 1; j <= inputJumlahDeret - 1; j++) {
						System.out.println("Text Print");
					}
				}
				*/
				
				
				
				int angkaAwal = scan.nextInt();
				int angkaAkhir = scan.nextInt();
				int inputPenambahan = scan.nextInt();
				System.out.println("Deret aritmatika");
				for(int i = angkaAwal+1; angkaAwal < angkaAkhir; i++) {
					System.out.print(angkaAwal + " ");
					angkaAwal += inputPenambahan;
					
					
					
					
					
					String kata1 = scan.next();
					int angka1 = scan.nextInt();
					String kata2 = scan.next();
					int angka2 = scan.nextInt();
					String kata3 = scan.next();
					int angka3 = scan.nextInt();
							
					System.out.print("============================");
					System.out.printf("\n%s\t\t%03d", kata1, angka1);
					System.out.printf("\n%s\t\t%03d", kata2, angka2);
					System.out.printf("\n%s\t\t%03d\n", kata3, angka3);
					System.out.print("============================");
					
				}

	}

}
