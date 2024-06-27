package JOBSHEET13.src.PRAKTIKUM2;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah06 {
    String kode;
    String nama;
    int sks;
    static List<MataKuliah06> daftarMataKuliah = new ArrayList<>();

    public MataKuliah06(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public static void dataMataKuliah() {
        daftarMataKuliah.add(new MataKuliah06("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah06("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah06("00003", "Algoritma dan Pemograman", 2));
        daftarMataKuliah.add(new MataKuliah06("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah06("00005", "Praktikum Algoritma dan Pemograman", 3));
    }

    public static void tampilDaftarMataKuliah() {
        System.out.println("\n========================================");
        System.out.println(" DAFTAR MATA KULIAH ");
        System.out.println("========================================");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-50s | %-5s|\n", "Kode", "Mata Kuliah", "SKS");
        System.out.println("--------------------------------------------------------------------------");

        for (MataKuliah06 mk : daftarMataKuliah) {
            System.out.printf("| %-10s | %-50s | %-5d|\n", mk.getKode(), mk.getNama(), mk.getSks());
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public static MataKuliah06 cariMataKuliah(String kode) {
        for (MataKuliah06 mk : daftarMataKuliah) {
            if (mk.getKode().equals(kode)) {
                return mk;
            }
        }
        return null;
    }
}
