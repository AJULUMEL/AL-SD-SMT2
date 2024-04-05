package JOBSHEET6.src.P7;

import java.util.Scanner;

public class BukuMain06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku06 data = new PencarianBuku06();
        int jmlBuku = 5;

        System.out.println("================================================================");
        System.out.println("Masukkan data Buku secara urut dari kodeBuku terkecil : ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("========================");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku06 m = new Buku06(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("================================================");
        System.out.println("Data Keseluruhan Buku :");
        data.tampil();

        System.out.println("________________________________________________________________");
        System.out.println("________________________________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search : ");
        int posisi = data.FindSeqSearch(cari);
        data.TampilData(cari, posisi);
        data.Tampilposisi(cari, posisi);

        // Buku21 dataBuku = data.findBuku(cari);
        // dataBuku.tampilDataBuku();

        // System.out.println("================================================");
        // System.out.println("Menggunakan Binary Search : ");
        // posisi = data.FindBinarySearch(cari, 0, jmlBuku - 1);
        // data.Tampilposisi(cari, posisi);
        // data.TampilData(cari, posisi);

        s.close();
        s1.close();

    }

}