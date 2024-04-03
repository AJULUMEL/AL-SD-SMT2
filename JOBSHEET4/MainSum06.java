package JOBSHEET4;

import java.util.Scanner;

public class MainSum06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Program Menghitung Keuntungan Perusahaan");
        System.out.println("=================================================");
        System.out.println();
        System.out.print("Masukkan jumlah perusahaan : ");
        int jumlahPerusahaan = sc.nextInt();

        Sum06 perusahaan[] = new Sum06[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan " + (i + 1) + " = ");
            int jumlahBulan = sc.nextInt();
            perusahaan[i] = new Sum06(jumlahBulan);

            System.out.println("Masukkan keuntungan perusahaan ke- " + (i + 1) +  " perbulan (Satuan juta. Misal 5.9)");
            for(int j= 0 ; j < jumlahBulan; j++){
                System.out.print("Bulan ke-" + (j+1) + ": ");
                perusahaan[i].keuntungan[j] =sc.nextDouble();
            }
        }
        
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("Detail Keuntungan tiap perusahaan");
        System.out.println("=====================================================");
        for (int l = 0; l < jumlahPerusahaan; l++) {
            System.out.println("Total keuntungan perusahaan " + (l + 1) + " selama " + perusahaan[l].elemen + " bulan adalah: ");
            System.out.println("Brute Force: " + perusahaan[l].totalBF(perusahaan[l].keuntungan));
            System.out.println("Divide Conquer: " + perusahaan[l].totalDC(perusahaan[l].keuntungan, 0, perusahaan[l].elemen - 1));
        }
        System.out.println("=====================================================");
    }
}