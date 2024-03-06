import java.util.Scanner;

public class TUGAS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-3): ");
            int menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            double v, s, t; // kecepatan, jarak, waktu

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jarak (s): ");
                    s = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = scanner.nextDouble();
                    v = hitungKecepatan(s, t);
                    System.out.println("Kecepatan (v) = " + v);
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (v): ");
                    v = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = scanner.nextDouble();
                    s = hitungJarak(v, t);
                    System.out.println("Jarak (s) = " + s);
                    break;
                case 3:
                    System.out.print("Masukkan jarak (s): ");
                    s = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (v): ");
                    v = scanner.nextDouble();
                    t = hitungWaktu(s, v);
                    System.out.println("Waktu (t) = " + t);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
        }
    }

    public static double hitungKecepatan(double s, double t) {
        return s / t;
    }

    public static double hitungJarak(double v, double t) {
        return v * t;
    }

    public static double hitungWaktu(double s, double v) {
        return s / v;
    }
}
