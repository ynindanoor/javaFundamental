package Day3;

import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//0 1 1 2 3 5
		int jumlahDeret = 10, angka1 = 0, angka2 =1;
		System.out.println("Deret Fibonacci");
		for (int i=1;i<=jumlahDeret;i++) {
			System.out.print(angka1+"  ");
			int angkaSebelumnya = angka1+angka2;
			angka1=angka2;
			angka2=angkaSebelumnya;
		}
		
//	int limit=5, past, current, fibonacci;
//    past = 1;
//    current = 1;
//    fibonacci = 1;
//    for (int i =1; i <= limit; i++){
//        System.out.print(current + ", ");
//        fibonacci = past + current;
//        past = current;
//        current = fibonacci;
		
		for (int i=0; i <=10; i++) {
			System.out.println("9 x "+i+" = " + (9*i));
		
		}
		
		System.out.println("Masukkan Angka : ");
		int inputAngka = input.nextInt();
		for (int i=0; i <=10; i++) {
			System.out.println(inputAngka+" x "+i+" = " + (inputAngka*i));
		}
		
		
    }}
//while : cek dulu kondisinya : selama benar dia akan melakukan terus
//do while : melakukan dulu baru terus berjalan jika kondisinya sesuai


