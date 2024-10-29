package contohKelasPertama;

import abstraksi.Kendaraan;

public class Mobil extends Kendaraan {

    public Mobil(final String warna){
        super(warna);
    }

    @Override
    public void bergerak(){
        System.out.println(" Mobil Bergerak ");
    }
}
