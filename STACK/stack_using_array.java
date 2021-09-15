package STACK;
import java.util.*;

    public class stack_using_array {

        int i=0;
        int top=-1;
        int max_elements;
        int [] stk_arr;
        stack_using_array(int m_e,int[] s_arr) {  //constructor
            this.max_elements = m_e;
            this.stk_arr=s_arr;
        }


//       method for pushing element in the stack
            public void push(int data) {
                if (top != max_elements - 1) {
                    stk_arr[i] = data;
                    top = top + 1;
                    i++;

                    show();
                    size();
                    stack_top();

                }
                else {
                    System.out.print("\n");
                    System.out.print("No space left for "+data);
                    isFull();
                }
            }

        //       method for popping out element from the stack
        public void pop() {
            if (top != -1) {

                top = top - 1;
                i--;

                System.out.println();
                System.out.println(stk_arr[i]+" Removed");
                show();
                size();
                stack_top();

            } else {
                isEmpty();
            }
        }

        //method to determine stack is full

        public void isFull()
        {
            if(top==max_elements-1)
            {

                System.out.println(" !!! Stack is FULL");
            }
        }


        //method to determine stack is empty

        public void isEmpty()
        {
            if(top==-1)
            {
                System.out.print("\n");
                System.out.println("Stack is EMPTY");
            }
        }

//        to determine size(no of elements in the stack) of the stack
        public void size()
        {
            int size=top+1;
            System.out.print("Size of the stack is: "+size+"\t\t\t\t");
        }


//     method printing top of( the stack
        public void stack_top()
        {
            System.out.print("Top of the array is: "+top);
            System.out.println();

        }


        public void show()
        {
            for (int j = 0; j <=top; j++) {
                System.out.print(stk_arr[j]+"\t");
            }
            System.out.println();
        }



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the maximum size of the STACK");
            int max_size = sc.nextInt();

            int[] arr = new int[max_size]; //defining array for stack implementation


            stack_using_array obj=new stack_using_array(max_size,arr);
            obj.push(17);
            obj.push(18);
            obj.push(19);
            obj.push(20);
            obj.push(21);

            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();
            obj.pop();

        }
    }
