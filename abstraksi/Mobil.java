package abstraksi;

public class Mobil extends Kendaraan{

    public Mobil(final String warna) {
        super ();
    }

    @Override
    void bergerak() {
        System.out.println("Mobil bergerak");
    }
}