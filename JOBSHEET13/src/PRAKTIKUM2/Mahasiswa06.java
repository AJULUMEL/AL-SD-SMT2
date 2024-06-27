package JOBSHEET13.src.PRAKTIKUM2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Mahasiswa06 {
    String nim;
    String nama;
    static Queue<Mahasiswa06> daftarMahasiswaQueue = new ArrayDeque<>();

    public Mahasiswa06(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public static void dataMahasiswa() {
        daftarMahasiswaQueue.add(new Mahasiswa06("20001", "Thalhan"));
        daftarMahasiswaQueue.add(new Mahasiswa06("20002", "Zubair"));
        daftarMahasiswaQueue.add(new Mahasiswa06("20003", "Abdur-Rahman"));
        daftarMahasiswaQueue.add(new Mahasiswa06("20004", "Sa ' ad"));
        daftarMahasiswaQueue.add(new Mahasiswa06("20005", "Sa ' id"));
        daftarMahasiswaQueue.add(new Mahasiswa06("20006", "Ubaidah"));
    }

    public static void tampilDaftarMahasiswa() {
        System.out.println("\n************************************************");
        System.out.println(" DAFTAR MAHASISWA ");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.printf("| %-10s | %-20s | %-10s |\n", "NIM", "Nama", "Telf");
        System.out.println("************************************************");

        for (Mahasiswa06 m : daftarMahasiswaQueue) {
            System.out.printf("| %-10s | %-20s | %-10s | \n", m.getNim(), m.getNama(), "021xxx");
        }
        System.out.println("************************************************");
    }

    public static Mahasiswa06 cariMahasiswa(String nim) {
        for (Mahasiswa06 m : daftarMahasiswaQueue) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }

    public static void hapusMahasiswa() {
        Mahasiswa06 removed = daftarMahasiswaQueue.poll();
        if (removed != null) {
            System.out.println("Mahasiswa dengan NIM " + removed.getNim() + " telah dihapus.");
        } else {
            System.out.println("Tidak ada mahasiswa yang dapat dihapus.");
        }
    }
}
