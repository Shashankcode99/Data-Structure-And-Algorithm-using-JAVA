package SINGLY_LINKED_LIST;

public class Runner {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insertAtStart(100);
        list.insertAtStart(250);
        list.insertAtStart(500);
        list.insertAtIndex(2,99);
        list.insertAtIndex(5,999);
        list.insertAtIndex(0,9999);
        list.deleteAtIndex(9);             //removes 20
        list.show();

    }
}
