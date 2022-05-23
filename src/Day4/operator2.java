import java.util.Scanner;

public class operator2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Laki-laki minimal penghasilan 7jt belum menikah, maka pajak 10%
		//Laki-laki penghasilan 7jt menikah, maka pajak 5%
		//Penghasilan < 7jt Tidak wajib pajak
		//Perempuan minimal penghasilan 7jt belum menikah, maka pajak 7%
		//Perempuan penghasilan 7jt menikah, maka pajak 4%
		//Penghasilan < 7jt Tidak wajib pajak
		//Laki-laki = 1, perempuan = 0
		
		
		
		System.out.println("Masukkan gender : 1 (Laki-laki), 0 (Perempuan)");
		int gender = input.nextInt();
		
		System.out.println("Sudah menikah : 1 (sudah), 0 (Belum)");
		int status = input.nextInt();
		
		System.out.print("Masukkan penghasilan = 1 (di atas 7 juta) 0 (di bawah 7 juta)");
		int penghasilan =input.nextInt();
		
		System.out.print("Masukkan nilai penghasilan = 1 (di atas 7 juta) 0 (di bawah 7 juta)");
		double nilaiPenghasilan =input.nextDouble();
		
		if(gender==1 && penghasilan==1 && status ==0)
		{
			System.out.printf("Pajak = Rp. "+ (0.10*nilaiPenghasilan));
		}
		else if(gender==1 && penghasilan==1 && status ==1)
		{
			System.out.printf("Pajak = Rp. "+ (0.05*nilaiPenghasilan));
		}
		else if(gender==0 && penghasilan==1 && status ==0)
		{
			System.out.printf("Pajak = Rp. "+ (0.07*nilaiPenghasilan));
		}
		else if(gender==0 && penghasilan==1 && status ==1)
		{
			System.out.printf("Pajak = Rp. "+ (0.04*nilaiPenghasilan));
		}

		else {System.out.println("Tidak Wajib Pajak");}
		
		
		
		
	}

}
