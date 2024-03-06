import java.util.Scanner;

public class Mobil {

    private String nama;
    private int cc;
    private int hargaBeli;
    private int thnProduksi;

    public Mobil(String nama, int cc, int hargaBeli, int thnProduksi) {
        this.nama = nama;
        this.cc = cc;
        this.hargaBeli = hargaBeli;
        this.thnProduksi = thnProduksi;
    }

    public double hitungPajak() {
        if (cc > 1500) {
            return hargaBeli * 0.1;
        } else {
            return hargaBeli * 0.075;
        }
    }

    public double hitungBiayaPerawatan() {
        if (thnProduksi < 2010) {
            return hargaBeli * 0.08;
        } else {
            return hargaBeli * 0.05;
        }
    }

    public double hitungBiayaTotal() {
        return hargaBeli + hitungPajak() + hitungBiayaPerawatan();
    }

    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("CC: " + cc);
        System.out.println("Harga Beli: " + hargaBeli);
        System.out.println("Tahun Produksi: " + thnProduksi);
        System.out.println("Pajak: " + hitungPajak());
        System.out.println("Biaya Perawatan: " + hitungBiayaPerawatan());
        System.out.println("Biaya Total: " + hitungBiayaTotal());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil[] mobil = new Mobil[3];

        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Masukkan data mobil ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("CC: ");
            int cc = scanner.nextInt();
            System.out.print("Harga Beli: ");
            int hargaBeli = scanner.nextInt();
            System.out.print("Tahun Produksi: ");
            int thnProduksi = scanner.nextInt();

            mobil[i] = new Mobil(nama, cc, hargaBeli, thnProduksi);
        }

        double totalBiayaPerawatan = 0;
        int jumlahMobil2010 = 0;
        for (Mobil m : mobil) {
            if (m.thnProduksi > 2010) {
                totalBiayaPerawatan += m.hitungBiayaPerawatan();
                jumlahMobil2010++;
            }
        }
        double rataRataBiayaPerawatan = totalBiayaPerawatan / jumlahMobil2010;

        Mobil mobilBiayaTotalTerbesar = null;
        for (Mobil m : mobil) {
            if (m.cc > 1500 && m.thnProduksi < 2010) {
                if (mobilBiayaTotalTerbesar == null
                        || m.hitungBiayaTotal() > mobilBiayaTotalTerbesar.hitungBiayaTotal()) {
                    mobilBiayaTotalTerbesar = m;
                }
            }
        }

        System.out.println("Mobil dengan biaya total terbesar:");
        if (mobilBiayaTotalTerbesar != null) {
            mobilBiayaTotalTerbesar.printData();
        } else {
            System.out.println("Tidak ada mobil yang memenuhi kriteria.");
        }
    }
}
