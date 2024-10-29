package abstraksi;

public abstract class Kendaraan {
    String warna;

    public Kendaraan(){
        this.warna = warna;
    }

    void bergerak() {

    }

    void info(){
        System.out.println("Warna : " + warna);
    }

    public abstract void bergerak();
}