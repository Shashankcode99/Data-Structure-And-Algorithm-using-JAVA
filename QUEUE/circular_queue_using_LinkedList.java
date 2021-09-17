package QUEUE;

class Node1{
    Node1 next;
    int data;
}

public class circular_queue_using_LinkedList {

    Node1 front = null;
    Node1 rear = null;


    public void ENQUEUE(int value) {
        Node1 new_node = new Node1();
        new_node.data = value;
        new_node.next = null;


        if (front == null && rear == null) {
            front = new_node;
            rear = new_node;
            rear.next=front;
        }

        else {
            rear.next=new_node;
            rear=new_node;
           rear.next=front;
        }
        show();
        peek();
        rear();
    }


    public void DEQUEUE() {

        if (front == null && rear == null) {
            isEmpty();
        }

        else if(front==rear)
        {

            System.out.println("");
            System.out.println("Removed last element "+rear.data+". QUEUE contains zero elements now");
            front=null;
            rear=null;

        }
        else {
            System.out.println("Removed "+front.data);
            front = front.next;
            rear.next=front;
            show();
            peek();
            rear();

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
    }

    public void rear()
    {
        System.out.println();
        System.out.print("Rear of the QUEUE is: "+rear.data);
        System.out.println("\n");
    }


    public void show() {
        System.out.println("The queue is:");

        if (front == null && rear == null) {
            System.out.println("EMPTY QUEUE");
        } else {
            Node1 temp = front;
            while (temp.next != front) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }


    public static void main(String[] args) {
        circular_queue_using_LinkedList list=new circular_queue_using_LinkedList();
        list.ENQUEUE(7);
        list.ENQUEUE(8);
        list.ENQUEUE(9);
        list.ENQUEUE(10);
        list.DEQUEUE();
        list.DEQUEUE();
        list.DEQUEUE();
        list.DEQUEUE();
        list.DEQUEUE();
        list.ENQUEUE(12);


    }
}
