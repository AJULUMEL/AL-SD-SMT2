package JOBSHEET13.src.PRAKTIKUM1;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa06 {
    String nim;
    String nama;
    static List<Mahasiswa06> daftarMahasiswa = new ArrayList<>();

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
        daftarMahasiswa.add(new Mahasiswa06("20001", "Thalhan"));
        daftarMahasiswa.add(new Mahasiswa06("20002", "Zubair"));
        daftarMahasiswa.add(new Mahasiswa06("20003", "Abdur-Rahman"));
        daftarMahasiswa.add(new Mahasiswa06("20004", "Sa ' ad"));
        daftarMahasiswa.add(new Mahasiswa06("20005", "Sa ' id"));
        daftarMahasiswa.add(new Mahasiswa06("20006", "Ubaidah"));
    }

    public static void tampilDaftarMahasiswa() {
        System.out.println("\n************************************************");
        System.out.println(" DAFTAR MAHASISWA ");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.printf("| %-10s | %-20s | %-10s |\n", "NIM", "Nama", "Telf");
        System.out.println("************************************************");

        for (Mahasiswa06 m : daftarMahasiswa) {
            System.out.printf("| %-10s | %-20s | %-10s | \n", m.getNim(), m.getNama(), "021xxx");
        }
        System.out.println("************************************************");
    }

    public static Mahasiswa06 cariMahasiswa(String nim) {
        for (Mahasiswa06 m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }
}