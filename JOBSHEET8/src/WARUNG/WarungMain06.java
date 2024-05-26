package JOBSHEET8.src.WARUNG;

import java.util.Scanner;

public class WarungMain06 {
    public static void menu() {
        System.out.println("\nPilih Menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("5. Cek Antrian Berdasarkan nama");
        System.out.println("6. Cek Semua Antrian");
        System.out.println("7. Data Pembeli");
        System.out.println("8. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue06 antri = new Queue06(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("\nNama \t\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor \t\t: ");
                    int no = sc.nextInt();

                    Pembeli06 nasabah02 = new Pembeli06(nama, no);
                    sc.nextLine();
                    antri.Enqueue(nasabah02);
                    break;

                case 2:
                    Pembeli06 data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noHP)) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    System.out.print("Masukkan nama pembeli: ");
                    String cariNama = sc.nextLine();
                    antri.peekPosition(cariNama);
                    break;

                case 6:
                    antri.print();
                    break;

                case 7:
                    antri.daftarPembeli();
                    break;

                case 8:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7
                || pilih == 8);
    }
}
