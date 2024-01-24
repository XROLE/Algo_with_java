import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglylinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 0);

        System.out.println(sLL.head.value);
    }
}
