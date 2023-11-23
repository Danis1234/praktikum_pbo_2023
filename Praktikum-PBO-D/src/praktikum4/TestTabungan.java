package praktikum4;

import java.util.Scanner;

public class TestTabungan {
	public static void main(String atgs[]) {
		Scanner input = new Scanner (System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukkan Jumlah Saldo : ");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.println("saldo awal : "+tabungan.saldo);
		
		System.out.print("Masukkan Saldo penarikan : ");
		tariktunai = input.nextInt();
		tabungan.ambilUang(tariktunai);
		System.out.println("Jumlah uang yang diambil : "+tariktunai);
		System.out.println("Saldo Sekarang : " +tabungan.saldo);
	}
}
