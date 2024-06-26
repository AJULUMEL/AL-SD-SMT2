package JOBSHEET12.src.Percobaan1;

public class Node06 {
    int data, jarak;
    Node06 prev, next;

    Node06(Node06 prev, int data, int jarak, Node06 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }
}