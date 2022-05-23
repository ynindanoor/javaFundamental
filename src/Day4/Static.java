
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static = managemen memori, statik : lebih hemat memori, non statik : sebaliknya.
		
		new Static().luasSegitiga(2,4);
		
	}
	public static void luasSegitiga (int alas, int tinggi) {
		double luas = 0.5*alas*tinggi;
		System.out.println(luas);
	}
}
