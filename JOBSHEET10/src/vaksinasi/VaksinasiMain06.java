package JOBSHEET10.src.vaksinasi;

import java.util.Scanner;

public class VaksinasiMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueDLL06 vaksinQueue = new QueueDLL06();

        int choice;
        do {
            System.out.println("\n+++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("----------------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine();
                    System.out.println("-Nama Penerima: ");
                    String nama = sc.nextLine();
                    vaksinQueue.enqueue(nomorAntrian, nama);
                    break;
                case 2:
                    vaksinQueue.dequeue();
                    vaksinQueue.displayQueue();
                    break;
                case 3:
                    vaksinQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 4);
        sc.close();
    }
}
