package JOBSHEET4;

public class Pangkat06 {

    int nilai;
    int pangkat;

    public Pangkat06(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 1)
            return a;
        else {
            if (n % 2 == 0)
                return pangkatDC(a, n / 2) * pangkatDC(a, n / 2);
            else
                return pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a;
        }
    }
}