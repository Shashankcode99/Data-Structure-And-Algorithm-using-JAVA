package SINGLY_LINKED_LIST;

public class LinkedList {
    Node head; //head is node type variable to determine pointing of head of the linked list
    Node tail;

    //INSERTION

//  1.  Inserting Node at the end

    public void insert(int value) {
        Node node = new Node();  //creating object of Node class
        node.data = value;
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;  //traversing the list until reaching last value which contains null
            }
            n.next = node;
            tail = node;
        }

        print_head_tail(head, node);

    }


    // 2.  Inserting nodes at the start
    public void insertAtStart(int value) {
        Node node1 = new Node();
        node1.data = value;
        node1.next = null;
        node1.next = head;   //current head which is the head value in the already existing linked list


        head = node1;   //changing the head of the linked list


//        traversing to determine head and tail of linked list and printing
//        it with thr help of function "print_head_tail"

        while (node1.next != null) {
            node1 = node1.next;
        }
        tail = node1;

        print_head_tail(head, tail);
    }


// 3.  Inserting nodes at any index

    public void insertAtIndex(int index, int value1) {
        Node node2 = new Node();
        node2.data = value1;
        node2.next = null;

        if (index == 0) {
            insertAtStart(value1);
        } else {
            Node nn = head;

            for (int i = 0; i < index - 1; i++) {
                nn = nn.next;   //to get the value of the node before "to be" inserted element
            }
            node2.next = nn.next;  //giving reference of node to next node with the help of node before "to be inserted" node
            nn.next = node2;  //node before "to be inserted" node is given reference of the "to be inserted" node


//        traversing to determine head and tail of linked list and printing it
//        with thr help of function "print_head_tail"

            while (node2.next != null) {
                node2 = node2.next;
            }
            tail = node2;
            print_head_tail(head, tail);
        }


    }


    //  DELETION


    //      1) from 0th index(start);
    public void deleteAtStart() {
        head = head.next; //changing the head to the next value in the 0th index node
        Node n3 = head;

//        traversing to determine head as well as of linked list and printing
//        it with thr help of function "print_head_tail"

        while (n3.next != null) {
            n3 = n3.next;
        }
        tail = n3;

        print_head_tail(head, tail);
    }


    //    2) from any specific index;

    public void deleteAtIndex(int index) {

        if (index == 0) {
            deleteAtStart();
        }

        else {
            Node n = head;
            Node n1 = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;


            while (n.next != null) {
                n = n.next;
            }
            tail = n;

            print_head_tail(head, tail);
        }

    }


        // 3)from last position

    public void delete_last() {
        if (head.next == null) {
            head = null;
        }
        else {

            Node temp=head;
            while(temp.next.next!=null)
            {
               temp=temp.next;
            }
            temp.next=null;



            while (temp.next!=null)
            {
                temp = temp.next;
            }
            tail = temp;
            print_head_tail(head, tail);
        }
        }



        public void show() {
            Node nd = head;
            while (nd.next != null) {
                System.out.print(nd.data + " ");
                nd = nd.next;
            }
            System.out.print(nd.data); //VIMP: printing of last element of linked list
        }


        public void print_head_tail(Node h, Node t)
        {
            System.out.println("Head of the LinkedList is:" + h.data);
            System.out.println("Tail of the LinkedList is:" + t.data);
        }
    }

