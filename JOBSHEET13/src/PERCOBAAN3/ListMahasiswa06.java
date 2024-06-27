package JOBSHEET13.src.PERCOBAAN3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa06 {
    List<Mahasiswa06> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa06... mahasiswa) {
        this.mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa06 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String nim) {
        // Mengurutkan list mahasiswas berdasarkan NIM
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs1.nim.compareTo(mhs2.nim));

        // Mencari menggunakan binary search
        Mahasiswa06 dummy = new Mahasiswa06(nim, "", ""); // Objek dummy untuk
        // pencarian
        int index = Collections.binarySearch(mahasiswas, dummy, (mhs1, mhs2) -> mhs1.nim.compareTo(mhs2.nim));
        return index >= 0 ? index : -1;
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));

    }

    public static void main(String[] args) {
        ListMahasiswa06 lm = new ListMahasiswa06();
        Mahasiswa06 m = new Mahasiswa06("201234", "Noureen", "021xx1");
        Mahasiswa06 m1 = new Mahasiswa06("201235", "Akhleema", "021xx2");
        Mahasiswa06 m2 = new Mahasiswa06("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        // System.out.println("Daftar Mahasiswa:");
        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa06("201235",
                "Akhleema Lela", "021xx2"));
        System.out.println("\nSetelah update:");
        lm.tampil();

        // BINARY

        int hasilPencarian = lm.binarySearch("201235");
        if (hasilPencarian != -1) {
            System.out.println("\nMahasiswa dengan NIM '201235' ditemukan pada indeks: "
                    + hasilPencarian);
        } else {
            System.out.println("\nMahasiswa dengan NIM '201235' tidak ditemukan.");
        }
        // Sorting ascending
        lm.sortAscending();
        System.out.println("\nSetelah sorting ascending:");
        lm.tampil();
        // Sorting descending
        lm.sortDescending();
        System.out.println("\nSetelah sorting descending:");
        lm.tampil();

    }
}
