package Day3;

public class Coba3 {
//do {
    // blok kode yang akan diulang} while (kondisi);
	
	public static void main(String[] args) {

        // membuat variabel
        int i = 0;

        do {
            System.out.println("perulangan ke-" + i);
            i++;
        } while ( i <= 10);

    
	
	// membuat variabel
    
	int x, y;

    // melakukan parulang sebnayan x dan y kali
    for (x = 0; x <= 5; x++){
        for( y = 0; y <= 3; y++){
            System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
        }
    }
}
}
