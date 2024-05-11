import java.util.Scanner;

public class Utama06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitasGudang = sc.nextInt();
        sc.nextLine();

        Gudang06 gudang = new Gudang06(kapasitasGudang);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Tampilkan tumpukan barang");
            System.out.println("5. Cari barang");
            System.out.println("6. Keluar");

            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang06 barangBaru = new Barang06(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    System.out.print("Masukkan kode barang yang ingin dicari: ");
                    int kodeCari = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang yang ingin dicari: ");
                    String namaCari = sc.nextLine();
                    gudang.cariBarang(kodeCari, namaCari);
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}