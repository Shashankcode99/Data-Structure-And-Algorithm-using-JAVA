package QUEUE;

class Node{
    Node next;
    int data;
}


public class queue_using_LinkedList {

    Node front = null;
    Node rear = null;


    public void ENQUEUE(int value) {
        Node new_node = new Node();
        new_node.data = value;
        new_node.next = null;


        if (front == null && rear == null) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
        show();
        peek();
    }


    public void DEQUEUE() {

        if (front == null && rear == null) {
            isEmpty();

        }

        else if(front==rear)
        {

            System.out.println("");
            System.out.println("Removed last element "+front.data+". QUEUE contains zero elements now");
            front=null;
            rear=null;

        }
        else {
            System.out.println("Removed "+front.data);
            front = front.next;
            show();
            peek();



        }

    }


    public void isEmpty()
    {
        System.out.println("UNDERFLOW: Nothing is left to be removed");
    }

    public void peek()
    {
        System.out.println();
        System.out.print("Peek of the QUEUE is: "+front.data);
        System.out.println("\n");
    }



    public void show() {
        System.out.println("The queue is:");

        if (front == null && rear == null) {
            System.out.println("EMPTY QUEUE");
        } else {
            Node temp = front;
            while (temp.next != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }


    public static void main(String[] args) {
        queue_using_LinkedList list=new queue_using_LinkedList();
        list.ENQUEUE(7);
        list.ENQUEUE(8);
        list.ENQUEUE(9);
        list.ENQUEUE(10);
        list.DEQUEUE();
        list.DEQUEUE();
        list.DEQUEUE();
        list.ENQUEUE(12);


    }
}
