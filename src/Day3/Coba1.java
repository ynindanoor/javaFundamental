package Day3;

public class Coba1 {

	public static void main(String[] argumen){

        for(int i=0; i <= 10; i++){
            System.out.print( i + " " );
        }
        
    for(int i=0; i <= 5; i++){
            System.out.println("*****");

    }
    for(int i = 1; i <= 20; i += 2){
        System.out.print( i + " ");
    }
    
 // membuat array
    int angka[] = {3,1,42,24,12};

    // menggunakan perulangan For each untuk menampilkan angka
    for( int x : angka ){
        System.out.print(x + " ");
    }
}}