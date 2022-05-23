package Day3;

public class Looping {
//looping ada yang bisa dihitung dan tidak, contoh:
	//dihitung/dibatasi : lari bolak balik 5x -- counted : for, for each
	//tidak dibatasi : lari secapeknya -- uncounted : while, do while
	//increment i++
	
	public static void main(String[] args) {
		/*cara manual
		System.out.println("Nexsoft");
		System.out.println("Nexsoft");
		System.out.println("Nexsoft");
		System.out.println("Nexsoft");
		System.out.println("Nexsoft");*/
		
		
		//looping
		// ++i maupun i++ di looping hasilnya sama.
		for(int i=1; i <= 10; i++){
            System.out.println(i+". Nexsoft");
	}
		for(int i=1; i <= 10; i=i+2){
            System.out.print(i+"  ");}
            
        System.out.println();
	
		for(int i=10; i >= 1; i--){
            System.out.print(i+"  ");
	}
		System.out.println();
		
		String nama= "Nexsoft";
		for(int i=1; i <= nama.length(); i++){
		System.out.print(i+" ");
}
		System.out.println();
		
		int errorLogin = 3;
		for (int i=1; i<=errorLogin;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//kalau nilai++ contoh di bawah akan menambah nilai yang sebelumnya.
		int nilai =10;
		System.out.println(nilai++);
		
		System.out.println();
		
		System.out.println(--nilai);
		
		//di dalam loop ada nested for (for bersarang)
		//for each biasa digunakan untuk searching, indeks ke berapa, biasanya mulai dari 0
		//setiap item/variabel yang ada di i, dalam data motor maka dilakukan perulangan, lalu diprint.
		String motor[] = {"Suzuki","Honda","Yamaha"};
		System.out.println(motor[1]);
		for(String i : motor) {
		System.out.println(i);
	}}}
