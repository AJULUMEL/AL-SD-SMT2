package JOBSHEET13.src.PRAKTIKUM2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nilai06 {
    Mahasiswa06 mahasiswa;
    MataKuliah06 mataKuliah;
    double nilai;
    static List<Nilai06> daftarNilai = new ArrayList<>();

    public Nilai06(Mahasiswa06 mahasiswa, MataKuliah06 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mahasiswa06 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah06 getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    public static void inputNilai() {
        Scanner sc = new Scanner(System.in);
        Mahasiswa06.tampilDaftarMahasiswa();
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine();
        Mahasiswa06 mahasiswa = Mahasiswa06.cariMahasiswa(nim);

        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
            return;
        }

        MataKuliah06.tampilDaftarMataKuliah();
        System.out.print("Pilih MK by kode: ");
        String kode = sc.nextLine();
        MataKuliah06 mataKuliah = MataKuliah06.cariMataKuliah(kode);

        if (mataKuliah == null) {
            System.out.println("Mata Kuliah tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Nilai: ");
        double nilai = sc.nextDouble();
        sc.nextLine(); // consume newline
        Nilai06 nilaiObj = new Nilai06(mahasiswa, mataKuliah, nilai);
        daftarNilai.add(nilaiObj);
    }

    public static void tampilNilai() {
        System.out.println("\n************************************************");
        System.out.println(" DAFTAR NILAI MAHASISWA ");
        System.out.println("************************************************");
        System.out.println(
                "********************************************************************************************");
        System.out.printf("| %-10s | %-20s | %-50s | %-5s | %-5s | \n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println(
                "********************************************************************************************");

        for (Nilai06 n : daftarNilai) {
            System.out.printf("| %-10s | %-20s | %-50s | %-5d | %-5.2f | \n", n.getMahasiswa().getNim(),
                    n.getMahasiswa().getNama(), n.getMataKuliah().getNama(), n.getMataKuliah().getSks(), n.getNilai());
        }
        System.out.println(
                "********************************************************************************************");
    }

    public static void cariNilaiMahasiswa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        int totalSks = 0;
        boolean found = false;

        System.out.println("\n************************************************");
        System.out.println(" DAFTAR NILAI MAHASISWA ");
        System.out.println("************************************************");
        System.out.println(
                "********************************************************************************************");
        System.out.printf("| %-10s | %-20s | %-50s | %-5s | %-5s | \n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println(
                "********************************************************************************************");

        for (Nilai06 n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.printf("| %-10s | %-20s | %-50s | %-5d | %-5.2f | \n", n.getMahasiswa().getNim(),
                        n.getMahasiswa().getNama(), n.getMataKuliah().getNama(), n.getMataKuliah().getSks(),
                        n.getNilai());
                totalSks += n.getMataKuliah().getSks();
                found = true;
            }
        }
        System.out.println(
                "********************************************************************************************");

        if (found) {
            System.out.println("Total SKS yang telah diambil sebanyak: " + totalSks + " SKS");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan atau belum memiliki nilai.");
        }
    }

    public static void urutDataNilai() {
        daftarNilai.sort((n1, n2) -> Double.compare(n2.getNilai(), n1.getNilai()));

        System.out.println("\n************************************************");
        System.out.println(" DAFTAR NILAI MAHASISWA ");
        System.out.println("************************************************");
        System.out.println(
                "********************************************************************************************");
        System.out.printf("| %-10s | %-20s | %-50s | %-5s | %-5s | \n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println(
                "********************************************************************************************");

        for (Nilai06 n : daftarNilai) {
            System.out.printf("| %-10s | %-20s | %-50s | %-5d | %-5.2f | \n", n.getMahasiswa().getNim(),
                    n.getMahasiswa().getNama(), n.getMataKuliah().getNama(), n.getMataKuliah().getSks(), n.getNilai());
        }
        System.out.println(
                "********************************************************************************************");
    }
}