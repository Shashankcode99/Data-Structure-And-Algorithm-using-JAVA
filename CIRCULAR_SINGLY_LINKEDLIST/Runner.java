package CIRCULAR_SINGLY_LINKEDLIST;

public class Runner {

    public static void main(String[] args) {
        Singly_CLL list=new Singly_CLL();

        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);


        list.insertAtStart(90);
        list.insertAtStart(80);
        list.insertAtStart(70);
        list.insertAtIndex(0,60);
        list.insertAtIndex(7,400);
        list.insertAtIndex(4,105);


        list.insertAtIndex(-2,100000);
        list.insertAtIndex(10,875856);





        list.deleteFromEnd();
        list.deleteFromStart();

        list.deleteFromIndex(2);
        list.deleteFromIndex(-1);
        list.deleteFromIndex(4);



    }
}
