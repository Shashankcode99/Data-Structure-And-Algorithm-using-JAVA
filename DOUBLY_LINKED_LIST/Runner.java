package DOUBLY_LINKED_LIST;

import DOUBLY_LINKED_LIST.DoublyLinkedList;

public class Runner {

    public static void main(String[] args) throws NullPointerException {
        DoublyLinkedList d_list = new DoublyLinkedList();
        d_list.insertAtEnd(60);
        d_list.insertAtEnd(70);
        d_list.insertAtEnd(80);
        d_list.insertAtEnd(90);

         d_list.insertAtStart(50);
         d_list.insertAtStart(40);
        d_list.insertAtIndex(1,100);
         d_list.insertAtIndex(-2,1000);

        d_list.deleteFromStart();
        d_list.deleteFromEnd();


        d_list.deleteAtIndex(3);
        d_list.deleteAtIndex(0);
        d_list.deleteAtIndex(-1);
        d_list.deleteAtIndex(8);


    }
}
