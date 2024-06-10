package JOBSHEET9.src.minggu11;

public class SLLMain06 {
    public static void main(String[] args) {
        SingleLinkedList06 singLL06 = new SingleLinkedList06();
        singLL06.print();
        singLL06.addFirst(890);
        singLL06.print();
        singLL06.addLast(760);
        singLL06.print();
        singLL06.addFirst(700);
        singLL06.print();
        singLL06.insertAfter(700, 999);
        singLL06.print();
        singLL06.insertAt(3, 833);
        singLL06.print();

        System.out.println("Data pada indeks ke-1= " + singLL06.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL06.indexOf(760));

        singLL06.remove(999);
        singLL06.print();
        singLL06.removeAt(0);
        singLL06.print();
        singLL06.removeFirst();
        singLL06.print();
        singLL06.removeLast();
        singLL06.print();
    }
}