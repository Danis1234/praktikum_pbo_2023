package Praktikum1;
import java.util.Scanner;

public class latihan {
	public static void main(String args[]) {
//		System.out.println("Hello Word");
		
//		inisialisasi variabel
		int angka1, angka2, hasil;
//		inialisasi input user
		Scanner input = new Scanner(System.in);
//		input user
		System.out.println("Masukan angka1 : ");
		angka1 = input.nextInt();
		System.out.println("Masukan angka2 : ");
		angka2 = input.nextInt();
		hasil = angka1 + angka2;
//		hasil
		System.out.println("hasilnya adalah : " +hasil);
		
		String namaDepan, namaBelakang, fullName;
		System.out.print("Masukan Nama Depan : ");
		namaDepan = input.next();
		System.out.print("Masukan Nama Belakang : ");
		namaBelakang = input.next();
		
		fullName = namaDepan + " " + namaBelakang;
		System.out.println(fullName);

		}
}
