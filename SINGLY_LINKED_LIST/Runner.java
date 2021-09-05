package SINGLY_LINKED_LIST;

public class Runner {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.insertAtIndex(0,0);
        list.insertAtIndex(6,7);
        list.insertAtIndex(3,3);
        list.insertAtIndex(-2,100000);
        list.insertAtIndex(8,8);
        list.insertAtIndex(10,99);

        list.deleteFromEnd();
        list.deleteFromEnd();
        list.deleteFromStart();
        list.deleteFromStart();
        list.deleteAtIndex(-3);
        list.deleteAtIndex(7);

    }
}
