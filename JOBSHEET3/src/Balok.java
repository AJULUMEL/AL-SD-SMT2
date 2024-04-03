class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Balok Ajul1 = new Balok(100, 30, 12);
        System.out.println("Volume Ajul1: " + Ajul1.hitungVolume());

        Balok Ajul2 = new Balok();
        System.out.println("Volume Ajul2: " + Ajul2.hitungVolume());
    }
}
