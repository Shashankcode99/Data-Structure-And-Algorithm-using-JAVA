package DOUBLY_LINKED_LIST;

import DOUBLY_LINKED_LIST.DoublyLinkedList;

public class Runner {

    public static void main(String[] args) throws NullPointerException
    {
    DoublyLinkedList d_list=new DoublyLinkedList();
         d_list.insert(100);
        d_list.insert(200);
        d_list.insert(300);
        d_list.insert(400);

        d_list.insertAtStart(1);
        d_list.insertAtStart(5);
        d_list.insertAtStart(7);

        d_list.insert(999);

        d_list.insertAtIndex(8,79);
        d_list.insertAtIndex(9,89);
        d_list.insertAtIndex(10,99);


//we use try catch block as it will throw a null pointer exception when we are using the last index element removal
try {
    d_list.delete(10);
}
catch(Exception e)
{
    System.out.println("The exception is:"+ e);
}
        d_list.show();
    }
}
