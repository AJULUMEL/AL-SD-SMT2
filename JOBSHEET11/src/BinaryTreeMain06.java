package JOBSHEET11.src;

public class BinaryTreeMain06 {
    public static void main(String[] args) {
        BinaryTree06 bt06 = new BinaryTree06();
        bt06.add(6);
        bt06.add(4);
        bt06.add(8);
        bt06.add(3);
        bt06.add(5);
        bt06.add(7);
        bt06.add(9);
        bt06.add(10);
        bt06.add(15);
        System.out.print("PreOrder Tranversal : ");
        bt06.traversePreOrder(bt06.root);
        System.out.println("");
        System.out.print("inOrder Tranversal : ");
        bt06.traverseInOrder(bt06.root);
        System.out.println("");
        System.out.print("PostOrder Tranversal : ");
        bt06.traversePostOrder(bt06.root);
        System.out.println("");
        System.out.println("Find Node : " + bt06.find(5));
        System.out.println("Delete Node 8 ");
        bt06.delete(8);
        System.out.println("");
        System.out.print("PreeOrder Traversal : ");
        bt06.traversePreOrder(bt06.root);
        System.out.println("");

    }
}
