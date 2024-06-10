package JOBSHEET9.src.minggu11.Tugas;

public class SingleLinkedListMain06 {
    public static void main(String[] args) {
        SingleLinkedList06 sll = new SingleLinkedList06();
        sll.addFirst(new MahasiswaSLL06("111", "anton"));
        sll.addLast(new MahasiswaSLL06("115", "sari"));
        sll.insertAfter("111", new MahasiswaSLL06("112", "prita"));
        sll.insertAfter("112", new MahasiswaSLL06("113", "yusuf"));
        sll.insertAt(3, new MahasiswaSLL06("114", "doni"));
        sll.print();
    }
}
