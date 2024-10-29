package polimorfisme;

import polimorfisme.Lingkaran;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        bangunDatar = new Persegi(4);
        System.out.println("Luas Persegi : " + bangunDatar.luas());
        System.out.println("Keliling Persegi : " + bangunDatar.keliling());

        bangunDatar = new Lingkaran(7);
        System.out.println("Luas Lingkaran : " + bangunDatar.luas());
        System.out.println("Keliling Lingkaran : " + bangunDatar.keliling());

        bangunDatar = new SegitigaSamaSisi(5);
        System.out.println("Luas Segitiga Sama Sisi : " + bangunDatar.luas());
        System.out.println("Keliling Segitiga Sama Sisi : " + bangunDatar.keliling());
    }
}