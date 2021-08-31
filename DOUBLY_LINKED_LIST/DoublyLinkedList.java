package DOUBLY_LINKED_LIST;

public class DoublyLinkedList {
    Node head;

    int count=0;

    public void insertAtEnd(int value)
    {
        Node dbn=new Node();
        dbn.previous=null;
        dbn.data=value;
        dbn.next=null;

        if (head==null)
        {
            head=dbn;
            count++;
        }
        else {
            Node dbn2 = head;
            while (dbn2.next != null) {
                dbn2 = dbn2.next;
            }
            dbn2.next = dbn;
            dbn.previous = dbn2;

            count++;
        }


        System.out.println("Head of the Doubly linked list is:-"+ head.data);
        System.out.println("Tail of the Doubly linked list is:-"+ dbn.data);
    }

    public void insertAtStart(int value)
    {
        Node dbn=new Node();
        if (head != null) {
            dbn.previous = null;
            dbn.data = value;
            dbn.next = head;
            head.previous=dbn;
        }
        head=dbn;

        count++;

        while(dbn.next!=null)
        {
            dbn=dbn.next;
        }

        System.out.println("Head of the Doubly linked list is:-"+ head.data);
        System.out.println("Tail of the Doubly linked list is:-"+ dbn.data);

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

         else if(index==count-1)
         {
             insertAtEnd(value);
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

             count++;
         }
        while(dbn3.next!=null)
        {
            dbn3=dbn3.next;
        }

        System.out.println("Head of the Doubly linked list is:-"+ head.data);
        System.out.println("Tail of the Doubly linked list is:-"+ dbn3.data);
    }




public void deleteFromStart()

    {
        Node h = head;
        head = h.next;
        h.previous = null;

        count--;

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        System.out.println("After Removing node from start");
        show();
        System.out.println("Head of the Doubly linked list is:-"+ head.data);
        System.out.println("Tail of the Doubly linked list is:-"+ temp.data);

    }

    public void deleteFromEnd() {
        Node h1 = head;
        while (h1.next != null) {
            h1 = h1.next;
        }
        Node last = h1.previous;
        last.next = null;

        count--;

        System.out.println("After Removing node from the end");
        show();
        System.out.println("Head of the Doubly linked list is:-" + head.data);
        System.out.println("Tail of the Doubly linked list is:-" + last.data);
    }


    public void deleteFromIndex(int index)
    {
        if (index==0)
        {
            deleteFromStart();
        }

 else {
            Node h1=head;
            for (int i = 0; i < index - 1; i++) {
                h1 = h1.next;
            }

            Node temp_nxt= h1.next;
            h1.next = temp_nxt.next;

            Node temp_prev=temp_nxt.next;
            temp_prev.previous=h1;

            count--;

            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }

            System.out.println("After Removing node from the end");
            show();
            System.out.println("Head of the Doubly linked list is:-" + head.data);
            System.out.println("Tail of the Doubly linked list is:-" + temp.data);

        }
//
    }



    public void show() {
     Node nd= head;
        while (nd.next != null) {
            System.out.print(nd.data+" ");
            nd= nd.next;
        }
        System.out.println(nd.data); //VIMP: printing of last element of linked list
    }

}
