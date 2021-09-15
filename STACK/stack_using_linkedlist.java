package STACK;

class Node
{
    int data;
    Node next;
}


public class stack_using_linkedlist {

    Node head=null;
    Node tail=null;
    Node top=null;

    public void push(int value)
    {
        Node new_node= new Node();
        new_node.data=value;
        new_node.next=top;
      if(top==null)
      {
          head=new_node;
          tail=new_node;
          top=head;
      }

      else
      {
          head=new_node;
          top=head;
      }


        System.out.print("The stack is:\t");
        show();
        System.out.println("HEAD of the list:"+ head.data);
        System.out.println("TAIL of the list:"+ tail.data);
        peek();
        System.out.println();
    }


    public void pop()
    {
        if(top==null)
        {
            System.out.println("UNDERFLOW: Nothing is left to pop");
        }

        else if(head==tail)
        {
            System.out.println("POPPED last element i.e "+top.data+" of the stack \n");
            top=null;
            head=null;
            tail=null;

        }

        else
        {
            System.out.println("REMOVED: "+top.data);
             head=head.next;
              top=head;

            System.out.print("The stack is:\t");
            show();
            System.out.println("HEAD of the list:"+ head.data);
            System.out.println("TAIL of the list:"+ tail.data);
            peek();
            System.out.println();

        }



    }


    public void peek()
    {
        System.out.println("TOP of the list is: "+top.data);
    }


    public void show()
    {
        if (head == null && tail == null) {
            System.out.println("EMPTY LIST");
        }

        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }


    }

    public static void main(String[] args) {

        stack_using_linkedlist list=new stack_using_linkedlist();
        list.push(7);
        list.push(8);
        list.push(9);

        list.pop();
        list.pop();
        list.pop();
        list.pop();


    }

}
