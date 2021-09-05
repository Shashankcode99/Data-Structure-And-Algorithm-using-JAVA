package CIRCULAR_SINGLY_LINKEDLIST;

public class Singly_CLL {
    Node head; //head is node type variable to determine pointing of head of the linked list
    Node tail;
    int node_count = 0;


    //INSERTION OF NODES

//  1.  Inserting Node at the end

    public void insertAtEnd(int value) {
        Node new_node = new Node();  //creating object of Node class
        new_node.data = value;
        new_node.next = null;

        if (head == null) {
            head = new_node;
            head.next = head;
            tail = new_node;
            node_count++;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;  //traversing the list until reaching last value which contains null
            }
            temp.next = new_node;
            new_node.next = head;
            tail = new_node;
            node_count++;
        }

        System.out.println("Element inserted is: " + new_node.data);
        System.out.print("List is as follows: ");
        show();
        System.out.print("\n");
        print_head_tail(head, tail);
    }


    //  2.  Inserting Node at the start
    public void insertAtStart(int value) {
        Node new_node = new Node();
        new_node.data = value;
        new_node.next = null;


        if (head == null) {
            head = new_node;
            head.next = head;
            tail = head;
            node_count++;
        } else {


            new_node.next = head;
            head = new_node; //new node at starting pointing to the head now as it will be added before head node
            tail.next=head; //changing the head in TAIL's next section

            node_count++;
        }
        System.out.println("Element inserted at start is: " + new_node.data);
        System.out.print("List is as follows: ");
        show();
        System.out.print("\n");
        print_head_tail(head, tail);
    }





    //3. inserting at given index

    public void insertAtIndex(int index,int value) {
        Node new_node = new Node();
        new_node.data = value;
        new_node.next = null;


        if (index >= 0 && index <= node_count) /* condition to check index lie between the
                                    HEAD and TAIl index of the list (inclusive)*/ {
            if (index == 0) {

                insertAtStart(value);
            } else if (index == node_count) {
                insertAtEnd(value);
            } else {
                Node temp = head;

                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                new_node.next = temp.next;
                temp.next = new_node;
                node_count++;


//
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




                              // DELETION OF NODES
    
//    1. deleting from start
    
      public  void deleteFromStart() {

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
                  head= temp;
                  tail.next=head;

                  node_count--;
                  System.out.println(" DELETED!! Starting Element of List ");



                  System.out.print("List is as follows: ");
                  show();
                  System.out.print("\n");
                  print_head_tail(head, tail);
              }
          }



        else{
            System.out.println("Nothing Left To Delete");
        }
      }


        //2. delete from last position

    public void deleteFromEnd()
    {
        if(node_count > 0) {

            if (tail == head) {
                head = null;
                tail = null;
                node_count--;
                System.out.println(" DELETED!! Last Element of List ");
                show();
            }

            else {

                Node temp = head;
                for (int i = 1; i < node_count - 1; i++) {
                    temp = temp.next;
                }

                temp.next = head;
                tail = temp;
                node_count--;
                System.out.println(" DELETED!! Last Element of List ");


                System.out.print("List is as follows: ");
                show();
                System.out.print("\n");
                print_head_tail(head, tail);
            }
        }

        else{
            System.out.println("Nothing Left To Delete");
        }
    }


//3.delete from any specific index;


    public void deleteFromIndex(int index) {
        if(node_count >0) {
            if (index == 0) {
                deleteFromStart();
            }

           else if(index==(node_count-1))
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
           else
            {
                Node temp=head;
                for (int i = 0; i <index-1 ; i++) {
                   temp=temp.next;
                }

                Node del_item=temp.next;

                temp.next=del_item.next;
                node_count--;


                System.out.println("DELETED!! Element from index: "+index);
                System.out.print("List is as follows: ");
                show();
                System.out.print("\n");
                print_head_tail(head, tail);
            }

        }

        else{
            System.out.println("Nothing Left To Delete");
        }
    }


//function to print the list
    public void show() {

        if (head == null && tail == null) {
            System.out.println("EMPTY LIST");
        } else {
            Node nd = head;
            while (nd.next != head) {
                System.out.print(nd.data + " ");
                nd = nd.next;
            }
            System.out.print(nd.data); //VIMP: printing of last element of linked list
        }
    }
//function to print the head and tail of the list
    public void print_head_tail(Node h, Node t)
    {

        System.out.println("Head of the LinkedList is:" + h ); //HEAD node address
        System.out.println("Head of the LinkedList is:"+h.data); // Value of HEAD node
        System.out.println("Tail of the LinkedList is:" + t.data); //Value of TAIL node
        System.out.println("TAIL NODE is pointing to " +t.next);  // checking the next value of the tail whether it is pointing to head node or not
    }
}

