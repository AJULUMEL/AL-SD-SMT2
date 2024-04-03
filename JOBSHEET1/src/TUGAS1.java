import java.util.Scanner;

public class TUGAS1 {
    public static void main(String[] args) {

        String[] KODE = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };

        String[][] KOTA = {
                { "BANTEN" },
                { "JAKARTA" },
                { "BANDUNG" },
                { "CIREBON" },
                { "BOGOR" },
                { "PEKALONGAN" },
                { "SEMARANG" },
                { "SURABAYA" },
                { "MALANG" },
                { "TEGAL" }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equalsIgnoreCase(inputKode)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Kota terkait: ");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.println(KOTA[index][i]);
            }
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}
