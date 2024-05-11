package UTS.src.manajemenstock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BarangMain {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        inisialisasiDataBarang(daftarBarang);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan/tambahkan data barang");
            System.out.println("2. Tampilkan semua data barang");
            System.out.println("3. Urutkan data barang berdasarkan nilai stok (mode menaik)");
            System.out.println("4. Menampilkan data Barang yang tergolong makanan yang tidak memiliki stok");
            System.out.println("5. Cari data barang berdasarkan kata kunci nama");
            System.out.println("6. Tambahkan stok untuk barang tertentu");
            System.out.println("7. Kurangi stok untuk barang tertentu");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    tambahDataBarang(daftarBarang, sc);
                    break;
                case 2:
                    tampilkanSemuaBarang(daftarBarang);
                    break;
                case 3:
                    urutkanStokMenaik(daftarBarang);
                    break;
                case 4:
                    tampilkanMakananTanpaStok(daftarBarang);
                    break;
                case 5:
                    cariBarangByNama(daftarBarang, sc);
                    break;
                case 6:
                    tambahStokBarang(daftarBarang, sc);
                    break;
                case 7:
                    kurangiStokBarang(daftarBarang, sc);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }

    private static void inisialisasiDataBarang(ArrayList<Barang> daftarBarang) {
        // Inisialisasi data barang sesuai dengan data yang diberikan
        daftarBarang.add(new Barang("16030927", "Indomilk", "Drink", 15000, 100));
        daftarBarang.add(new Barang("16100617", "Sprite", "Drink", 7000, 70));
        daftarBarang.add(new Barang("16240401", "Yakult", "Drink", 9000, 500));
        daftarBarang.add(new Barang("16270525", "Indomie", "Food", 3500, 250));
        daftarBarang.add(new Barang("16971204", "Oreo", "Food", 12000, 320));
        daftarBarang.add(new Barang("16100727", "Chocochips", "Food", 4000, 120));
        daftarBarang.add(new Barang("16460329", "Ballpoint", "Stationary", 2000, 75));
        daftarBarang.add(new Barang("16320421", "Pencil", "Stationary", 2000, 110));
        daftarBarang.add(new Barang("16180729", "Book", "Stationary", 4500, 57));
    }

    private static void tambahDataBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kategori barang: ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan harga satuan: ");
        double hargaSatuan = scanner.nextDouble();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();

        Barang barangBaru = new Barang(kodeBarang, nama, kategori, hargaSatuan, stok);
        daftarBarang.add(barangBaru);
        System.out.println("Data barang berhasil ditambahkan.");
    }

    private static void tampilkanSemuaBarang(ArrayList<Barang> daftarBarang) {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada data barang.");
        } else {
            for (Barang barang : daftarBarang) {
                System.out.println(barang);
            }
        }
    }

    private static void urutkanStokMenaik(ArrayList<Barang> daftarBarang) {
        Collections.sort(daftarBarang, Comparator.comparingInt(Barang::getStok));
        tampilkanSemuaBarang(daftarBarang);
    }

    private static void tampilkanMakananTanpaStok(ArrayList<Barang> daftarBarang) {
        boolean found = false;
        for (Barang barang : daftarBarang) {
            if (barang.getKategori().equalsIgnoreCase("Food") && barang.getStok() == 0) {
                System.out.println(barang);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada barang makanan tanpa stok.");
        }
    }

    private static void cariBarangByNama(ArrayList<Barang> daftarBarang, Scanner scanner) {
        System.out.print("Masukkan kata kunci nama barang: ");
        String kataKunci = scanner.nextLine();
        boolean found = false;

        for (Barang barang : daftarBarang) {
            if (barang.getNama().toLowerCase().contains(kataKunci.toLowerCase())) {
                System.out.println(barang);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    private static void tambahStokBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        System.out.print("Masukkan kode barang untuk menambah stok: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan jumlah stok tambahan: ");
        int tambahan = scanner.nextInt();
        scanner.nextLine();

        for (Barang barang : daftarBarang) {
            if (barang.getKodeBarang().equalsIgnoreCase(kodeBarang)) {
                barang.tambahStok(tambahan);
                System.out.println("Stok barang berhasil ditambahkan.");
                return;
            }
        }

        System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
    }

    private static void kurangiStokBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        System.out.print("Masukkan kode barang untuk mengurangi stok: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan jumlah stok yang ingin dikurangi: ");
        int pengurangan = scanner.nextInt();
        scanner.nextLine();

        for (Barang barang : daftarBarang) {
            if (barang.getKodeBarang().equalsIgnoreCase(kodeBarang)) {
                barang.kurangiStok(pengurangan);
                System.out.println("Stok barang berhasil dikurangi.");
                return;
            }
        }

        System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
    }
}

