package abstraksi;

public abstract class Kendaraan {
    String warna;

    public Kendaraan(final String warna){
        this.warna = warna;
    }

    void bergerak() {

    }

    void info(){
        System.out.println("Warna : " + warna);
    }

    protected abstract void bergerak();
}
