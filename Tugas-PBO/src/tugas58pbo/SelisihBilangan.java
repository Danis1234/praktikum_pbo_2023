package tugas58pbo;

public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        int hasil = getX() - getY();
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + hasil);
    }
}
