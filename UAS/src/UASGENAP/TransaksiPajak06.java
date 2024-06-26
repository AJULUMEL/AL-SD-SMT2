

public class TransaksiPajak06 {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan06 Kendaraan;

    public TransaksiPajak06(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan06 kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.Kendaraan = kendaraan;
    } // jawaban soal nomor 1

    public String toString() {
        return "TransaksiPajak{" +
                "kode=" + kode +
                ", nominalBayar=" + nominalBayar +
                ", denda=" + denda +
                ", bulanBayar=" + bulanBayar +
                ", kendaraan=" + Kendaraan +
                '}';
    }
}
