package UTS.src.manajemenstock;

public class Barang {
    private String kodeBarang, nama, kategori;
    private double hargaSatuan;
    private int stok;

    public Barang(String kodeBarang, String nama, String kategori, double hargaSatuan, int stok) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.hargaSatuan = hargaSatuan;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int tambahan) {
        stok += tambahan;
    }

    public void kurangiStok(int pengurangan) {
        if (pengurangan <= stok) {
            stok -= pengurangan;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    public String toString() {
        return "Kode Barang: " + kodeBarang +
                "\nNama: " + nama +
                "\nKategori: " + kategori +
                "\nHarga Satuan: " + hargaSatuan +
                "\nStok: " + stok + "\n";
    }
}
