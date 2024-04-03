package JOBSHEET5.src.sortingHotel;

public class Hotel06 {
    String nama;
    String kota;
    int harga;
    byte bintang;

    Hotel06(String n, String k, int h, byte b) {
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;
    }

    void tampil() {
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Rating: " + bintang);
    }
}
