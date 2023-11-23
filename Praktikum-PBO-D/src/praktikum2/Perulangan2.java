package praktikum2;
import java.util.Scanner;

public class Perulangan2 {
	public static void main(String args[]) {
//		inisialisasi
		int angka1,angka2,hasil,perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.print("Masukan Angka 1 : ");
		 angka1 = input.nextInt();
		 System.out.print("Masukan Angka 2 : ");
		 angka2 = input.nextInt();
		 
		System.out.print("Masukkan angka Perhitungan Perhitungan : "
				+ "\n 1 : +"
				+ "\n 2 : -"
				+ "\n 3 : *"
				+ "\n 4 : /");
		perhitungan = input.nextInt();
		
//		Pengkondisian
		
	if(perhitungan == 1) {
			 hasil = angka1 + angka2;
			 System.out.print("Hasilnya adalah : "+hasil);		 
			 
	}else if(perhitungan == 2) {
			 hasil = angka1 - angka2;
			 System.out.print("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 3) {
		     hasil = angka1 * angka2;
		     System.out.print("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 4) {
		    hasil = angka1 / angka2;
		    System.out.print("Hasilnya adalah : "+hasil);
		
	}
		
}
	
}