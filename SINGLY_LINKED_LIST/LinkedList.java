package SINGLY_LINKED_LIST;

public class LinkedList {
    Node head; //head is node type variable to determine pointing of head of the linked list

//  1.  Inserting Node at the end

    public void insert(int value) {
        Node node = new Node();  //creating object of Node class
        node.data = value;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
          while(n.next!=null)
          {
                n = n.next;  //traversing the list until reaching last value which contains null
            }
            n.next = node;
        }
    }


// 2.  Inserting nodes at the start
  public void insertAtStart(int value)
    {
Node node1= new Node();
node1.data= value;
node1.next=null;
node1.next=head;   //current head which is the head value in the already existing linked list

head=node1;   //changing the head of the linked list
    }




// 3.  Inserting nodes at any index

    public void insertAtIndex(int index , int value1) {
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

        }
    }

// 4. deletion of a node
//      i) from 0th index(start);
//    ii) from any specific index;
    public void deleteAtIndex(int index)
    {
        if (index==0)
        {
            head=head.next; //changing the head to the next value in the 0th index node
        }
        else
        {
            Node n=head;
            Node n1=null;

            for (int i = 0; i <index-1 ; i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
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
