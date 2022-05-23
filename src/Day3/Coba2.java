package Day3;
import java.util.Scanner;
public class Coba2 {
	public static void main(String[] args) {

        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

    
	int i = 0;

	while ( i <= 10 ){
	    // blok kode yang akan diulang
	   System.out.println("Perulangan ke-" + i);

	    // increment nilai i
	    i++;
	}
}}
