package Latihankonstruktordestruktor;

//  Nama (NPM) : 1. Aufa Akhdan Khairi (221106842887)
//			     2. Fida Van Saeli (221186843011)
//			     3. Muhammad Danise Raditya Saneistha (221186042959)
//
//  Kelas 	 : Reguler D
//  tugas	 : Latihan Pertemuan 4 Konstruktor destruktor
//  		 : Latihan 50. Energi Kinetik
//
//

public class EnergiKinetik50 {
    private double massa; // Massa bola baseball dalam kilogram
    private double kecepatan; // Kecepatan dalam meter per detik

    public EnergiKinetik50(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public double hitungUsaha() {
        double energiAwal = 0.0; // Energi awal (bola diam)
        double energiAkhir = hitungEnergiKinetik();
        return energiAkhir - energiAwal;
    }

    public static void main(String[] args) {
        EnergiKinetik50 bola = new EnergiKinetik50(0.145, 25.0);

        double energiKinetik = bola.hitungEnergiKinetik();
        System.out.println("Energi Kinetik bola baseball adalah: " + energiKinetik + " joule");

        double usaha = bola.hitungUsaha();
        System.out.println("Usaha yang dilakukan pada bola baseball untuk mencapai kecepatan ini adalah: " + usaha + " joule");
    }
}
