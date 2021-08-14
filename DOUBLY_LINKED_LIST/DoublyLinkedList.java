package DOUBLY_LINKED_LIST;

public class DoublyLinkedList {
    Node head;
    public void insert(int value)
    {
        Node dbn=new Node();
        dbn.previous=null;
        dbn.data=value;
        dbn.next=null;

        if (head==null)
        {
            head=dbn;
        }
        else
        {
            Node dbn2=head;
            while(dbn2.next!=null)
            {
                Node prevVal=dbn2;
                dbn2.previous=prevVal;
                dbn2=dbn2.next;
            }
            dbn2.next=dbn;
        }
    }

    public void insertAtStart(int value)
    {
    Node dbn=new Node();
    dbn.previous=null;
    dbn.data=value;
    dbn.next=head;
    head=dbn;


    }


    public void insertAtIndex(int index,int value)
    {
       Node dbn3=new Node();
        dbn3.previous=null;
        dbn3.data=value;
        dbn3.next=null;
         if (index==0)
         {
         insertAtStart(value);
          }

         else
         {
            Node storage=head;
             for (int i = 0; i <index-1 ; i++) {
               storage=storage.next;
             }
             dbn3.previous=storage;
             dbn3.next=storage.next;
             storage.next=dbn3;

         }
    }

public void delete(int index)
{
    if (index==0)
    {
        head=head.next;
        head.previous=null;
    }
    else
    {
        Node h=head;
        Node change_prev=null; //to store the node value of the element before the element to be deleted
        Node change_next=null; // to store the the node value of the element after the element to be deleted
        while(h.next!=null) {
            for (int i = 0; i < index - 1; i++) {
                h = h.next;
            }
            change_next = h.next;  //
            change_prev = change_next.next;
            h.next = change_prev;
            change_prev.previous = h;
        }


    }

}
    public void show() {
     Node nd= head;
        while (nd.next != null) {
            System.out.print(nd.data+" ");
            nd= nd.next;
        }
        System.out.print(nd.data); //VIMP: printing of last element of linked list
    }

}
