

import java.util.Scanner;

public class MainKendaraan06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DLLKendaraan06 dll = new DLLKendaraan06();

            Kendaraan06 data1 = new Kendaraan06("S 4567 YV", "Basko", "Mobil", 2000, 1, 2012, 4, null, null);
            Kendaraan06 data2 = new Kendaraan06("N 4511 VS", "Arta", "Mobil", 2500, 2, 2015, 3, null, null);
            Kendaraan06 data3 = new Kendaraan06("AB 4321 A", "Wisnu", "Motor", 125, 3, 2010, 2, null, null);
            Kendaraan06 data4 = new Kendaraan06("B 1234 AG", "Sisa", "Motor", 150, 4, 2020, 1, null, null);

            dll.AddLast(data1);
            dll.AddLast(data2);

            System.out.println("=======================");
            System.out.println("Menu");
            System.out.println("=======================");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan Nama Pemilik");
            System.out.println("5. Keluar");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("=======================");
                    System.out.println("\nDaftar Kendaraan");
                    System.out.println("=======================");
                    dll.Print();
                    break;
                case 2:

                case 5:
                    System.exit(0);
                default:
                    System.out.println("Maaf, Anda salah memasukkan nomor!");
                    ;
            }
        }
    }
}