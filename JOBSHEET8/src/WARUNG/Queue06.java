package JOBSHEET8.src.WARUNG;

public class Queue06 {
    Pembeli06[] antrian;
    int front, rear, size, max;

    public Queue06(int n) {
        max = n;
        antrian = new Pembeli06[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP + " ");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Atrian berhasil dikosongkan");
        } else {
            System.out.println("Atrian masih kosong");
        }
    }

    public void Enqueue(Pembeli06 dt) {
        if (isFull()) {
            System.out.println("Atrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli06 Dequeue() {
        Pembeli06 dt = new Pembeli06();
        if (isEmpty()) {
            System.out.println("Atrian masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Atrian terdepan: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Atrian masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (antrian[i].nama.equals(nama)) {
                    pos = (front + i) % max;
                    break;
                }
            }
            if (pos != -1) {
                System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (pos + 1));
            } else {
                System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
            }
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar pembeli dalam antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + antrian[i].nama);
            }
        }
    }

}