package tugas55pbo;

public class Main {
    public static void main(String[] args) {
//
        Android androidPhone = new Android("Samsung", "Android", "Grand", 3000000);
        androidPhone.setKeyStore("234ibfd3840fo");

        androidPhone.displayProduct();
        System.out.println("Android Key Store: " + androidPhone.getKeyStore());
        System.out.println();

//        
        BlackBerry blackberryPhone = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackberryPhone.setPinBB("BHS249");

        blackberryPhone.displayProduct();
        System.out.println("PIN: " + blackberryPhone.getPinBB());
        System.out.println();

//
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");

        windowsPhone.displayProduct();
        System.out.println("Wp Key Store: " + windowsPhone.getWpKeyStore());
    }
}

