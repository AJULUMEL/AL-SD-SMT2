public class Gudang06 {

    Barang06[] tumpukan;
    int size, top;

    public Gudang06(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang06[size];
        top = -1;
    }

    public boolean cekKosong() {
        return top == -1;
    }

    public boolean cekPenuh() {
        return top == size - 1;
    }

    public void tambahBarang(Barang06 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang06 ambilBarang() {
        if (!cekKosong()) {
            Barang06 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang06 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang06 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public void cariBarang(int kodeCari, String namaCari) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].kode == kodeCari && tumpukan[i].nama.equals(namaCari)) {
                System.out.println("Barang ditemukan di tumpukan dengan indeks " + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Barang tidak ditemukan di tumpukan");
        }
    }
}