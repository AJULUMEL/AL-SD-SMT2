package JOBSHEET9.src.minggu11.Tugas;

public class SingleLinkedList06 {
    Node06 head;
    int size;

    public SingleLinkedList06() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        if (isEmpty())
            System.out.println("SLL kosong!!!");
        else {
            Node06 tmp = head;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }

    public void addFirst(MahasiswaSLL06 mhs) {
        Node06 newNode = new Node06(mhs);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(MahasiswaSLL06 mhs) {
        Node06 newNode = new Node06(mhs);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node06 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }

    public void insertAfter(String afterNim, MahasiswaSLL06 mhs) {
        if (isEmpty()) {
            addFirst(mhs);
        } else {
            Node06 tmp = head;
            while (tmp != null) {
                if (tmp.data.nim.equalsIgnoreCase(afterNim)) {
                    Node06 newNode = new Node06(mhs);
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                    break;
                } else {
                    tmp = tmp.next;
                }
            }
        }
    }

    public void insertAt(int idx, MahasiswaSLL06 mhs) {
        if (isEmpty() || idx == 0) {
            addFirst(mhs);
        } else if (idx == size) {
            addLast(mhs);
        } else {
            Node06 tmp = head;
            for (int i = 0; i < idx - 1; i++) {
                tmp = tmp.next;
            }
            Node06 newNode = new Node06(mhs);
            newNode.next = tmp.next;
            tmp.next = newNode;
            size++;
        }
    }
}
