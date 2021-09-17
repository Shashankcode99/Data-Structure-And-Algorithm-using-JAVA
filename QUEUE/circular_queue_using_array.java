package QUEUE;
import java.util.Scanner;
public class circular_queue_using_array {

    int[] Q_arr;
    int max_size;
    int front=-1;
    int rear=-1;
    circular_queue_using_array(int size)
    {
        Q_arr=new int[size];
        this.max_size=size;
    }

    public void ENQUEUE(int value)
    {
        if (front==-1 && rear==-1) {
            front++;
            rear++;
            Q_arr[rear]=value;
            show();
            peek();
        }

        else if((rear+1) % max_size==front)
        {
           isFull();

        }
        else {

            rear=(rear+1) % max_size;
            Q_arr[rear] = value;
            show();
            peek();
        }

    }


    public void DEQUEUE()
    {

        if(front==-1 && rear==-1)
        {
           isEmpty();
        }

        else if(front==rear)
        {
            System.out.println("REMOVED last element of the queue: "+Q_arr[rear]+"\n");
            front=rear=-1;

        }

        else{
            System.out.print("REMOVED: "+Q_arr[front]+"\n");
            front=(front+1)%max_size;
            show();
            peek();
        }
    }



    public void isFull()
    {
        System.out.print("\n");
        System.out.println("OVERFLOW");
    }


    public void isEmpty()
    {
        System.out.println("UNDERFLOW: Nothing is left to be removed");
    }


    public void peek()
    {
        System.out.println();
        System.out.print("Peek of the QUEUE is: "+Q_arr[front]);
        System.out.println("\n");
    }

    public void show() {
        int i = front;
        System.out.println("The queue is:");

        if (front == -1 && rear == -1) {
            isEmpty();
        } else {
            while (i != rear) {
                System.out.print(Q_arr[i] + "\t");
                i = (i + 1) % max_size;
            }
            System.out.print(Q_arr[i]);
        }

    }
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the QUEUE");
        int arr_size=sc.nextInt();
        circular_queue_using_array Q=new circular_queue_using_array(arr_size);

        Q.ENQUEUE(7);
        Q.ENQUEUE(8);
        Q.ENQUEUE(9);
        Q.ENQUEUE(10); //creates overflow(queue is full) if size passed will be 3;

        Q.DEQUEUE();
        Q.DEQUEUE();
        Q.DEQUEUE();

        Q.ENQUEUE(11);
        Q.ENQUEUE(12);
        Q.ENQUEUE(13);
        Q.ENQUEUE(14);
//        Q.DEQUEUE();
//        Q.DEQUEUE();
//        Q.DEQUEUE();
    }
}
