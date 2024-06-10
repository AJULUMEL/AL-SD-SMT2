package JOBSHEET9.src.minggu11;

public class SingleLinkedList06 {
    Node06 head, tail;
    int size;

    public SingleLinkedList06() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node06(item, head);
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node06 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node06(item, null);
            size++;
        }
    }

    public void insertAfter(int key, int item) {
        Node06 tmp = head;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            tmp.next = new Node06(item, tmp.next);
            size++;
        }
    }

    public void insertAt(int index, int item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node06 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node06(item, tmp.next);
            size++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            Node06 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    int getSize() {
        int count = 0;
        Node06 tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        System.out.println(count);
        return count;
    }

    int getData(int index) {

        Node06 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node06 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masing kosong, "
                    + "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masing kosong, "
                    + "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node06 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong"
                    + "tidak dapat dihapus");
        } else {
            Node06 temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node06 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}