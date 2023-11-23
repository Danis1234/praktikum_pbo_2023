package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		String namaKucing, warnaKucing;
		int beratKucing;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan Nama Kucing : ");
		namaKucing = input.next();
		
		System.out.print("Masukkan warna Kucing : ");
		warnaKucing = input.next();
		
		System.out.print("Masukkan berat Kucing : ");
		beratKucing = input.nextInt();
		
//		nampilin nama
		Cat kucingSaya = new Cat();
		kucingSaya.identitas(namaKucing,warnaKucing,beratKucing);
		
		System.out.println("Kucing "+kucingSaya.name
				+" Warnanya "+kucingSaya.ambilWarna()
				+" beratnya "+kucingSaya.ambilBerat());
		kucingSaya.eat();
	}

}
