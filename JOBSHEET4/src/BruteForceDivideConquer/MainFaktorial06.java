package BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial06[] fk = new Faktorial06[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial06();
            System.out.println("masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah "
                    + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++){
            System.out.println
            ("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "
                    + fk[i].faktorialDC(fk[i].nilai));
        }
    }

}
