package JOBSHEET6.src.P7;

public class PencarianBuku06 {
    Buku06 listBk[] = new Buku06[5];
    int idx;

    void tambah(Buku06 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku06 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks  " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul Buku \t : " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : " + listBk[pos].pengarang);
            System.out.println("Stock \t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public Buku06 findBuku(int cari) {
        Buku06 bukuFound = null;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                bukuFound = listBk[i];
                break;
            }
        }
        return bukuFound;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        while (right >= left) {
            int mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            }
            if (listBk[left].kodeBuku <= cari && cari <= listBk[mid].kodeBuku) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}