import CircularSinglyLinkedList.CircularSinglyLinkedList;
import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // SINGLY LINKED LIST ==================================================
        // SinglyLinkedList sLL = new SinglyLinkedList();
        // sLL.createSinglylinkedList(5);
        // System.out.println(sLL.head.value);
        // sLL.insertInLinkedList(6, 1);
        // sLL.insertInLinkedList(7, 3);
        // sLL.insertInLinkedList(8, 4);
        // sLL.insertInLinkedList(9, 0);
        // sLL.traverseSinglyLinkedList();
        // sLL.searchNode(79);
        // sLL.deletionOfNode(9);
        // sLL.deleteSLL();
        // sLL.traverseSinglyLinkedList();
        // System.out.println(sLL.head.value);
        

        // CIRCULAR SINGLY LINKED LIST ==================================================
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSinglyLinkedList(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
        System.out.println(csll.head.next.next.value);
    }
}
