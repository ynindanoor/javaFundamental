
public class operator {
public static void main(String[] args) {
	// + - / * % aritmetik
	// +=
	// < >
	// && || !
	// ? : hanya ada dua pilihan
	
	//|| vs |
	int a = 10; //0000 1010
	int b = 5;  //0000 0101
	int c = 20; //0000 1111
	int d = 0;  //0001 0100
//	System.out.println(a>b || a<c);
//	System.out.println(a>b | a<c);
//	
//	System.out.println(a>b || a++<c);
//	System.out.println(a);
//	System.out.println(a>b | a++<c);
//	System.out.println(a);
	
	d = a & b;
	System.out.println("a & b = "+d);
	d = a | b;
	System.out.println("a | b = "+d);
	d = c & b;
	System.out.println("c & b = "+d);
}
}
