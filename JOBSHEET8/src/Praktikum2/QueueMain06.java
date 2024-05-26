package JOBSHEET8.src.Praktikum2;

import java.util.Scanner;

public class QueueMain06 {
    public static void menu() {
        System.out.println("\nPilih Menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc02.nextInt();
        Queue06 antri = new Queue06(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc02.nextInt();
            sc02.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("\nNo Rekening \t: ");
                    String norek = sc02.nextLine();
                    System.out.print("Nama \t\t: ");
                    String nama = sc02.nextLine();
                    System.out.print("Alamat \t\t: ");
                    String alamat = sc02.nextLine();
                    System.out.print("Umur \t\t: ");
                    int umur = sc02.nextInt();
                    System.out.print("Saldo \t\t: ");
                    double saldo = sc02.nextDouble();

                    Nasabah06 Nasabah06 = new Nasabah06(norek, nama, alamat, umur, saldo);
                    sc02.nextLine();
                    antri.Enqueue(Nasabah06);
                    break;

                case 2:
                    Nasabah06 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                                + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
