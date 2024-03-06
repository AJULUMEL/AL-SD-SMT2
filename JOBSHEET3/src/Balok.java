class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    // Konstruktor pertama
    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    // Konstruktor kedua (konstruktor overload)
    public Balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        // Membuat objek Ajul dengan menggunakan konstruktor pertama
        Balok Ajul1 = new Balok(100, 30, 12);
        System.out.println("Volume Ajul1: " + Ajul1.hitungVolume());

        // Membuat objek Ajul dengan menggunakan konstruktor kedua
        Balok Ajul2 = new Balok();
        System.out.println("Volume Ajul2: " + Ajul2.hitungVolume());
    }
}
