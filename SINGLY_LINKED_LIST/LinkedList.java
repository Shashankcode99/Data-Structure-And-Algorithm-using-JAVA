package SINGLY_LINKED_LIST;

public class LinkedList {
    Node head; //head is node type variable to determine HEAD(first element) of the linkedList
    Node tail; //head is node type variable to determine TAIL(last element) of the linkedList

    int node_count=0; //keeps record of number of nodes inserted and deleted



                                    //INSERTION

//  1.  Inserting Node at the end

    public void insertAtEnd(int value) {
        Node new_node = new Node();  //creating object of Node class
        new_node.data = value;
        new_node.next = null;

        if (head == null) {
            head = new_node; //assigning HEAD with new node inserted
            tail=new_node; //assigning TAIL with new node inserted

            node_count++;  //count of node gets incremented
        }


        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;  //traversing the list until reaching last value which contains null
            }
            temp.next = new_node;
            tail=new_node;

            node_count++;
        }
        System.out.println("Element inserted is: " + new_node.data);
        System.out.print("List is as follows: ");
        show();
        System.out.print("\n");
        print_head_tail(head, tail);

    }


  // 2.  Inserting nodes at the start

    public void insertAtStart(int value) {
        Node new_node = new Node();
        new_node.data = value;
        new_node.next = null;

        if (head == null) {
            head = new_node;
            tail = new_node;
            node_count++;
        }
        else {
            new_node.next = head;
            head = new_node;  //changing head of the list


            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = temp;
            node_count++;
        }
            System.out.println("Element inserted at start is: " + new_node.data);
            System.out.print("List is as follows: ");
            show();
            System.out.print("\n");
            print_head_tail(head, tail);

        }

       // 3.  Inserting nodes at any index

    public void insertAtIndex(int index, int value ) {
        Node new_node = new Node();
        new_node.data = value;
        new_node.next = null;

if(index>=0 && index<=node_count) /* condition to check index lie between the
                                    HEAD and TAIl index of the list (inclusive)*/
{

    if (index == 0) {
        insertAtStart(value);
    }

    else if (index == node_count) {
        insertAtEnd(value);
    }
    else {
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;   //to get the value of the node before "to be" inserted element
        }
        new_node.next = temp.next;  //giving reference of node to next node with the help of node before "to be inserted" node
        temp.next = new_node;  //node before "to be inserted" node is given reference of the "to be inserted" node

        node_count++;


//        traversing to determine head and tail of linked list and printing it
//        with thr help of function "print_head_tail"

        Node temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        tail = temp2;


        System.out.println("Element inserted is: " + new_node.data);
        System.out.print("List is as follows: ");
        show();
        System.out.print("\n");
        print_head_tail(head, tail);
    }
}
else if(index>node_count && node_count!=0)  //condition to check that index should not be 1 more than last index of the list
{
    System.out.println("Incorrect index input -----> INDEX EXCEEDED");
}

else if(index<0) //condition to check that index should not be negative
{
    System.out.println("Incorrect index input -----> INDEX IS NEGATIVE");
}
else
{
    System.out.println("LIST IS EMPTY");
}


}




//  DELETION

    //      1) delete from last position
    public void deleteFromEnd() {

        if(node_count>0) //condition to check that nodes are present in the list and it is not empty

        {

            if (tail==head) {
                head = null;
               tail=null;
               node_count--;
                System.out.println(" DELETED!! Last Element of List ");
                show();
            }

            else {

              Node temp=head;
                for (int i = 1; i <node_count-1 ; i++) {
                    temp=temp.next;
                }

                temp.next=null;
                tail=temp;
                node_count--;
                System.out.println(" DELETED!! Last Element of List ");


//        traversing to determine head as well as of linked list and printing
//        it with thr help of function "print_head_tail"
                Node temp2 = head;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }

                System.out.print("List is as follows: ");
                show();
                System.out.print("\n");
                print_head_tail(head, tail);
            }


        }

        else
        {
            System.out.println("Nothing Is Left To Delete");
        }
    }



//    // 2)delete from Oth position(i.e start )

    public void deleteFromStart() {
        if (node_count > 0) {
            if (head==tail) {
                head = null;
                tail=null;
                node_count--;
                System.out.println(" DELETED!! Last Element of List ");
                show();
            }

            else {
              Node temp=head.next;
              head.next=null;
              head=temp;

              node_count--;
              System.out.println(" DELETED!! Starting Element of List ");


//        traversing to determine head as well as of linked list and printing
//        it with thr help of function "print_head_tail"
                Node temp2 = head;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }
                tail=temp2;
                System.out.print("List is as follows: ");
                show();
                System.out.print("\n");
                print_head_tail(head, tail);
            }
        }

        else {
            System.out.println("Nothing Is Left To Delete");
        }
    }



//
//    //    3) delete from any specific index;
//
    public void deleteAtIndex(int index) {

        if(node_count>0)
        {
        if (index == 0) {
            deleteFromStart();
        }
        else if(index==node_count-1)
        {
            deleteFromEnd();
        }
        else if(index<0)
        {
            System.out.println("DELETION NOT POSSIBLE------> NEGATIVE INDEX INPUT");
        }
        else if(index>=node_count)
        {
            System.out.println("DELETION NOT POSSIBLE------> EXCEEDED INDEX INPUT");
        }
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp= temp.next;
            }
           Node update = temp.next;
            temp.next = update.next;
             node_count--;

            Node temp2=head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
             tail=temp2;
            System.out.println("DELETED!! Element from index: "+index);
            System.out.print("List is as follows: ");
            show();
            System.out.print("\n");
            print_head_tail(head, tail);
        }
    }

else{
            System.out.println("Nothing Is Left To Delete");
        }
    }


        public void show() {

            if (head == null && tail == null) {
                System.out.println("EMPTY LIST");
            } else {
                Node temp = head;
                while (temp.next != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.print(temp.data); //VIMP: printing of last element of linked list
            }
        }

        public void print_head_tail(Node h, Node t)
        {
            System.out.println("Data in Head of the LinkedList is: " + h.data);

            System.out.println("Data in Tail of the LinkedList is: " + t.data);

            System.out.println("Tail of the LinkedList is pointing to: " + t.next);

        }
    }

