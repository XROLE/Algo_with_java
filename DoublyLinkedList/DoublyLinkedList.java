package DoublyLinkedList;

public class DoublyLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    public DoubleNode createDoublyLinkedList(int nodeValue) {
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();

        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;

        return head;
    }

}
