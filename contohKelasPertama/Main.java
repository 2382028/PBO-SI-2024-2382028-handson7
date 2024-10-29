package contohKelasPertama;

import abstraksi.Mobil;

public class Main {
    public static void main(String[] args) {
        Mobil mobilHitam = new Mobil("Hitam", "Toyota", 180); // Objek
        mobilHitam.tampilkanInfo(); // Method

        Mobil mobilMerah = new Mobil("Merah", "Honda", 200);
        mobilMerah.tampilkanInfo();
    }
}
