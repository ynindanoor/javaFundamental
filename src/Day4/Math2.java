import java.util.Scanner;

public class Math2 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	//Substring
	 String teks1 = "nexsoft juara"; //spasi akan terhitung juga
	 //misal NIM yang ada kode jurusan, nomer urut, tahun masuk
	 System.out.println(teks1.substring(11,13));
	 System.out.println(teks1.substring(1,4));
	 System.out.println(teks1.substring(4,7));
	 
	 System.out.println("Masukkan NIM (11 digit angka) : ");
	 String nim = input.nextLine();
	 System.out.println("NIM :" +nim);
	 System.out.println("Tahun masuk : " +nim.substring(0,4));
	 System.out.println("Fakultas : " +nim.substring(4,6));
	 System.out.println("Prodi : " +nim.substring(6,8));
	 System.out.println("No. Urut : " +nim.substring(8,11));
	 
	 
//	 String nim = "20180102003";
//	 System.out.println("NIM :" +nim);
//	 System.out.println("Tahun masuk : " +nim.substring(0,4));
//	 System.out.println("Fakultas : " +nim.substring(4,6));
//	 System.out.println("Prodi : " +nim.substring(6,8));
//	 System.out.println("No. Urut : " +nim.substring(8,11));
	 
//server kampus, misal D = Dosen, M = Mahasiswa
//KTP, NIP, isinya ada tanggal lahir
//Beda substring dengan charAt -- substring = bisa banyak, charAt = hanya satu karakter, di posisi tersebut
	 System.out.println(teks1.contains("so")); //apakah dalam setiap kata mengandung huruf tersebut? digunakan ketika bernilai true jika kata tersebut ada dan berurutan

	 //digunakan saat negative test case, sudah tau salah, tapi tetap harus di test.
	 String message = "Error : Username Password Invalid";
	 if(message.contains("Invalid")) {
		 System.out.println("Passed!");
	 } else {
		 System.out.println("Failed!");
	 }
	 
	 //compare : membandingkan dua hal atau dua huruf juga
	 String nama1 = "Dono";
	 String nama2 = "Doyok";
	 System.out.println(nama1.compareTo(nama2)); //buka ascii table, tidak dicek semuanya, huruf pertama dan kedua sama (Do), saat compare yang ketiga n dan y, di ascii tabel beda -11 = n : 110, y : 121
	 System.out.println(nama2.compareTo(nama1)); 
 }
}
