import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglylinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 0);

        sLL.traverseSinglyLinkedList();
        // sLL.searchNode(79);
        sLL.deletionOfNode(9);
        
        sLL.traverseSinglyLinkedList();
        // System.out.println(sLL.head.value);
    }
}
