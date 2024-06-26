package JOBSHEET10.src.vaksinasi;

public class Node06 {
    int nomorAntrian;
    String nama;
    Node06 next, prev;

    Node06(int nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}
