

public class Kendaraan06 {
    String no_tnkb, nama, jenis;
    int cc, tahun, bulan_harus_bayar, data;
    Kendaraan06 prev, next;

    Kendaraan06(String no_tnkb, String nama, String jenis, int cc, int data, int tahun, int bulan_harus_bayar, Kendaraan06 prev, Kendaraan06 next) {
        this.no_tnkb = no_tnkb;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulan_harus_bayar = bulan_harus_bayar; //jawaban soal nomor 1
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}