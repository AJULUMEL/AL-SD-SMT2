import java.util.Scanner;

class PersegiPanjang {
    public int panjang;
    public int lebar;
}

public class ArrayObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah persegi panjang: ");
        PersegiPanjang[] ppArray = new PersegiPanjang[sc.nextInt()];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        PersegiPanjang[][] ppArray2 = new PersegiPanjang[2][3];
        
        ppArray2[0][0] = new PersegiPanjang();
        ppArray2[0][0].panjang = 3;
        ppArray2[0][0].lebar = 5;

        System.out.println("Panjang: " + ppArray2[2][3].panjang + ", Lebar: " + ppArray2[2][3].lebar);
    }
}
