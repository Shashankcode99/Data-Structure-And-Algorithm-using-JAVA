package CIRCULAR_DOUBLY_LINKEDLIST;

public class Runner {
    public static void main(String[] args) {

        Doubly_CLL list = new Doubly_CLL();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtStart(1);
        list.insertAtStart(0);

        list.insertAtIndex(5,100);
        list.insertAtIndex(-2,100);
        list.deleteFromStart();

        list.deleteFromEnd();

        list.deleteAtIndex(2);
        list.deleteAtIndex(1);
        list.deleteAtIndex(0);
        list.deleteAtIndex(5);
    }
}