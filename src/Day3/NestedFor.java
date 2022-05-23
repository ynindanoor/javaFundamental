package Day3;

public class NestedFor {
	public static void main(String[] args) {
		//lebih ke keamanan jika for>1
		//melihat for yang di dalam (j) dahulu baru disesuaikan dengan for yang luar(i)
		/*for (int i=1; i<=2; i++) {
			for(int j=5;j>=1;j--) {
				System.out.println(i+" "+j);
		}
			
	}
		for (int i=1; i<=3; i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(" * ");
}
			System.out.println();
			
		}
		
		for (int i=1; i<=1; i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" * ");
}
			System.out.println();
			
		}
		//2 * 4 * 6 * 8
		//2 * 4 * 6 * 
		//2 * 4 * 6
		//2 * 4 *
		//2 * 4
		//2 *
		//2
		
		//ctrl + shift + x
		for (int i = 9; i>1; i--) {
			for (int j = 2; j<i; j++)
			if (j%2==0)
				System.out.print(j);
			  else System.out.print(" * "); 
			System.out.println();*/
			
		//Tampilkan bilangan yang habis dibagi 3 dan 5
		//range 20-200
		//berapa totalnya
		int sum = 0;
		for (int i = 20; i<=200; i++) {
			if (i%3==0) {
				sum +=i;
				System.out.print(i+" ");
				
			}
			else if (i%5==0) {
				sum +=i;
				System.out.print(i+" ");
			}
			
			
		}System.out.println();
		System.out.println("Total : "+sum);
		
	}}
			
	