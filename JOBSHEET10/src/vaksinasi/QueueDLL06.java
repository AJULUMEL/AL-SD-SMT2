package JOBSHEET10.src.vaksinasi;

public class QueueDLL06 {
    Node06 head;
    int size;

    public QueueDLL06() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int nomorAntrian, String nama) {
        Node06 newNode = new Node06(nomorAntrian, nama);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node06 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println("Data Pengantri Vaksin yang Divaksinasi:");
            System.out.println("Nomor Antrian: " + head.nomorAntrian);
            System.out.println("Nama Penerima: " + head.nama);
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void displayQueue() {
        if (!isEmpty()) {
            System.out.println("\nDaftar Penerima Vaksin:");
            Node06 current = head;
            while (current != null) {
                System.out.println("Nomor Antrian: " + current.nomorAntrian + ", Nama Penerima: " + current.nama);
                current = current.next;
            }
            System.out.println("Jumlah Antrian Tersisa: " + size);
        } else {
            System.out.println("Antrian kosong!");
        }
    }

}
