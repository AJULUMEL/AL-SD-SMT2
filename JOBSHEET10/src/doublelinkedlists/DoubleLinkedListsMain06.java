package JOBSHEET10.src.doublelinkedlists;

public class DoubleLinkedListsMain06 {
    public static void main(String[] args) throws Exception{
        DoubleLinkedLists06 dll = new DoubleLinkedLists06();
        dll.print();
        
        System.out.println("Size : " +dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();

        System.out.println("Size : " +dll.size());
        System.out.println("============================");
        dll.add(40, 1);
        dll.print();

        System.out.println("Size : " +dll.size());
        System.out.println("============================");
        System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah : "+dll.getLast());
        System.out.println("Data indels ke-1 pada Linked Lists adalah : " + dll.get(1));
    }
}
