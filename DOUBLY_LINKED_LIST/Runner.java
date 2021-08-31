package DOUBLY_LINKED_LIST;

import DOUBLY_LINKED_LIST.DoublyLinkedList;

public class Runner {

    public static void main(String[] args) throws NullPointerException {
        DoublyLinkedList d_list = new DoublyLinkedList();
        d_list.insertAtEnd(100);
        d_list.insertAtEnd(200);

        d_list.insertAtStart(500);
        d_list.insertAtStart(600);

        d_list.insertAtEnd(800);

        d_list.insertAtIndex(5,999);
        d_list.insertAtIndex(2,300);
        d_list.insertAtIndex(4,400);

        d_list.show();

             d_list.deleteFromIndex(0);
             d_list.deleteFromIndex(4);


        d_list.deleteFromStart();
        d_list.deleteFromStart();


        d_list.deleteFromEnd();
        d_list.deleteFromEnd();

    }
}
