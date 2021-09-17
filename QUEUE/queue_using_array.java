package QUEUE;

import java.util.Scanner;

public class queue_using_array {

    int[] Q_arr;
    int max_size;
    int front=-1;
    int rear=-1;
    queue_using_array(int size)
    {
        Q_arr=new int[size];
        this.max_size=size;
    }

    public void ENQUEUE(int value)
    {
        if (rear== max_size - 1) {
            isFull();
        }

        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            Q_arr[rear]=value;
            show();
            peek();
        }
        else {

            rear++;
            Q_arr[rear] = value;
            show();
            peek();
        }

    }


    public void DEQUEUE()
    {

        if(front<rear)
        {
            front=front+1;
            show();
            peek();
        }

        else if(front==rear)
        {
            front=front+1;
            System.out.println("REMOVED last element of the queue: "+Q_arr[rear]+"\n");
        }

        else{
            isEmpty();
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

    public void show()
    {
        System.out.println("The queue is:");
        for (int j = front; j <=rear ; j++) {
            System.out.print(Q_arr[j]+"\t");
        }
    }


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the QUEUE");
         int arr_size=sc.nextInt();
        queue_using_array Q=new queue_using_array(arr_size);

        Q.ENQUEUE(7);
        Q.ENQUEUE(8);
        Q.ENQUEUE(9);
        Q.ENQUEUE(10); //creates overflow(queue is full) if size passed will be 3;

        Q.DEQUEUE();
        Q.DEQUEUE();
        Q.DEQUEUE();

        Q.ENQUEUE(11);  //this is the drawback-->even thogh there is space left in the
                             // queue but it is not able to insert it
                             //instead shows overflow(queue is full)
        Q.DEQUEUE();  //removes last element of the queue
        Q.DEQUEUE(); //UNDERFLOW(queue is empty)
    }
}
