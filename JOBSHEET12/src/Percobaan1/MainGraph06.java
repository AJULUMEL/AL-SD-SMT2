package JOBSHEET12.src.Percobaan1;

import java.util.Scanner;

public class MainGraph06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph06 gdg = new Graph06(6);

        // Menambahkan edge sesuai instruksi
        gdg.addEdge(0, 1, 50);  // A -> B
        gdg.addEdge(0, 2, 100); // A -> C
        gdg.addEdge(1, 3, 70);  // B -> D
        gdg.addEdge(2, 3, 40);  // C -> D
        gdg.addEdge(3, 4, 60);  // D -> E
        gdg.addEdge(4, 5, 80);  // E -> F
        gdg.degree(0);
        gdg.printGraph();

        // Menghapus edge yang tidak diinginkan
        gdg.removeEdge(2, 5); // Menghapus edge C -> F

        // Mencetak graf setelah penghapusan edge
        System.out.println("Graf setelah penghapusan edge:");
        gdg.printGraph();

        // Memeriksa dan mencetak apakah ada jalur antara gedung yang diinput
        System.out.print("Masukkan gedung asal: ");
        int asal1 = sc.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan1 = sc.nextInt();

        if (gdg.checkPath(asal1, tujuan1)) {
            System.out.println("Gedung " + (char) ('A' + asal1) + " dan " + (char) ('A' + tujuan1) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal1) + " dan " + (char) ('A' + tujuan1) + " tidak bertetangga");
        }

        // Menambahkan contoh lain untuk memastikan hasilnya
        System.out.print("Masukkan gedung asal: ");
        int asal2 = sc.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan2 = sc.nextInt();

        if (gdg.checkPath(asal2, tujuan2)) {
            System.out.println("Gedung " + (char) ('A' + asal2) + " dan " + (char) ('A' + tujuan2) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal2) + " dan " + (char) ('A' + tujuan2) + " tidak bertetangga");
        }

        sc.close();
    }
}
