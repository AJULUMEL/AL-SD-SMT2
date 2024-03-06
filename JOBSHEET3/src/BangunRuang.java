import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Kerucut krc[] = new Kerucut[3];
        LimasS4SamaSisi lim[] = new LimasS4SamaSisi[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("r kerucut(int) = ");
            int rKerucut = sc.nextInt();
            System.out.print("SM kerucut(int) = ");
            int smKerucut = sc.nextInt();
            krc[i] = new Kerucut(rKerucut, smKerucut);
            System.out.print("sisi alas limas(int)");
            int saLimas = sc.nextInt();
            System.out.print("tinggi limas(int) = ");
            int tLimas = sc.nextInt();
            lim[i] = new LimasS4SamaSisi(saLimas, tLimas);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Vol kerucut ke- "+ i + " = " +krc[i].hitungVolume());

    }
}
}