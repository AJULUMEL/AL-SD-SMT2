package QUIZ2DANDI;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        // lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll.deleteLast();
        dll.print();
        dll.printFromTail();
        // lanjutkan dengan memanggil method merge, split
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(5);
        dll2.addFirst(4);
        dll2.addFirst(3);
        dll2.addFirst(2);
        dll2.addFirst(1);

        dll.merge(dll2);
        dll.print();
        dll.printFromTail();

    }

    // No. 3 Kode Ganjil
    // public static void merge(DoubleLinkedList dll1,
    // DoubleLinkedList dll2) {
    // complete this method
    // }

    // No. 3 Kode Genap
    public static void split(DoubleLinkedList dll) {
        DoubleLinkedList list1 = new DoubleLinkedList();
        DoubleLinkedList list2 = new DoubleLinkedList();

        int mid = dll.size / 2;
        Node current = dll.head;

        for (int i = 0; i < mid; i++) {
            list1.addFirst(30);
            current = current.n;
        }

        while (current != null) {
            list2.addFirst(50);
            current = current.n;
        }

        System.out.print("List 1: ");
        list1.print();
        System.out.print("List 2: ");
        list2.print();
    }
}
