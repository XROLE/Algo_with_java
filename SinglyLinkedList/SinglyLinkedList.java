package SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;

    public int size;

    public Node createSinglylinkedList(int nodeValue) {
        head = new Node();

        Node node = new Node();
        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = node;

        size = 1;

        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createSinglylinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;

        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            Node nexNode = tempNode.next;
            tempNode.next = node;
            node.next = nexNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList() {
        if(head == null){
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;

            for(int i = 0; i < size; i++){
                System.out.println(tempNode.value);

                if(i != size - 1){
                    System.out.println(" -> ");
                }

                tempNode = tempNode.next;
            }
        }

        System.out.println("\n");

    }

    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;

            for(int i = 0; i < size - 1; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Fount the node at location : " + i + "\n");
                    return true;
                }

                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found ");
        return false;
    }
}
