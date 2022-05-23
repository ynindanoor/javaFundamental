
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//palindrom : susunan kata yang bisa dibolak balik
		//contoh : 22022022, kasur rusak
		//dapat menggunakan reverse
		
		new Palindrom().palindrome("kasur rusak");
		new Palindrom().palindromReverse("2202202");

	}
	public void palindrome(String teks) {
		String poli = "";
		
		for(int i=teks.length();i>0;i--) {
			String huruf = teks.substring(i-1,i);
			poli += huruf;
			
		}
		
		if(teks.equals(poli)) {
			System.out.println(teks+" ini palindrom");
		} else {
			System.out.println(teks+" bukan palindrom");
		}
	}
	//stringBuffer
	//reverse
	public void palindromReverse(String teks2) {
		StringBuffer balikTeks = new StringBuffer(teks2);
		balikTeks.reverse();
		if(teks2.equals(balikTeks.toString())) {
			System.out.println(teks2+" ini palindrom");
		} else {
			System.out.println(teks2+" bukan palindrom");
		}
	}
	
	//Cara 3 bisa menggunakan CharAt
	//urutan tidak terlalu berpengaruh saat menulis method
	//jangan lupa install kebutuhan yang diperlukan
	//bikin akun gitHub
	
	
	//float hanya bisa 22.0/7.00, lebih sering digunakan double.
	//dalam kelas ada : modifier, body class, dll.
}
