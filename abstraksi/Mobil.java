package abstraksi;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    // Konstruktor
    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public Mobil(String hitam) {
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan Maks : " + kecepatanMaks);
    }


    // Getter dan Setter untuk 'warna'
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk 'merek'
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter dan Setter untuk 'kecepatanMaks'
    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setKecepatanMaks(int kecepatanMaks) {

    }

    public void bergerak() {
    }
}

