package Day3;
import java.util.Scanner;
public class BreakContinue {
	public static void main(String[] args) {
//		int i = 0, sum = 0;
//		while(i<5) {
//			i++;
//			sum += i; //break untuk berhenti, continue untuk berhenti di kondisi tersebut/angka yang diinginkan lalu dilanjutkan kembali ke angka selanjutnya.
//			if(i == 3) continue;
//			System.out.println(i);
//		}
////		System.out.println(sum);
		
		for(int i=0;i<10;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		Scanner input = new Scanner(System.in);
//		while(true) {
//			System.out.println("Close ya/tidak?");
//			String jawab = input.nextLine();
//			if(jawab.equalsIgnoreCase("ya")) {
//				break;
//			}
//		} System.out.println("Terima Kasih");
//	}
//	
	int angka;
	while(true) {
	System.out.println("Silakan input angka : ");
	angka = input.nextInt();
	if(angka==0) {
		break;
	}
		}
	System.out.println("OK");

	
}}
