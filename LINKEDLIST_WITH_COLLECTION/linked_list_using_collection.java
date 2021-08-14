package LINKEDLIST_WITH_COLLECTION;
import java.util.LinkedList;
public class linked_list_using_collection
{
    public static void main(String[] args)
    {


        LinkedList<Integer> list1=new LinkedList<>();  //list number 1
        LinkedList<Integer> list2=new LinkedList<>();  //list number 2


        /* ADDING ELEMENTS IN LIST 1*/
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
//        System.out.println(list1);

        list1.add(3,495); //adding element at a specific index
//        System.out.println(list1);


        list1.addFirst(1);//adding element at the beginning of the list

        list1.addLast(999); //adding element at the end of the list

//        System.out.println(list1);


        boolean t=list1.contains(10); /* used to check whether a specifies value is present in the
                               list or not and gives a boolean value i.e (true or false) */
        boolean f=list1.contains(10000000);

//        System.out.println(t);
//        System.out.println(f);


        int g=list1.get(5); /*get method() is used to retrieve
                                 value at a specified index in the list */

//        System.out.println(g);


        int gf=list1.getFirst(); //retrieves first element of the list
        int gl=list1.getLast();  //retrieves last element of the list

//        System.out.println("First Element of the List is:"+gf);
//        System.out.println("Last Element of the List is:"+gl);


        /* Now adding elements into list 2 and performing functions on two list*/
        list2.add(12);
        list2.add(24);
        list2.add(36);
        list2.add(48);
        list2.add(60);
        list2.add(48);
        list2.add(36);


//        System.out.println(list2);


        list1.addAll(list2);
        /*used to append one list to the end of the other list
          Here list2 is appended to the end of list1*/

//        System.out.println(list1);

        list1.addAll(4,list2); /*used to append one list from a particular index
                                      of the other list.
                                    Here list2 is appended from index 4 of list1*/

//        System.out.println(list1);


        int first_index=list2.indexOf(48);
        /* indexOf() prints the first occurrence of the object and returns -1
        if value is not present in the list*/

        int last_index=list2.lastIndexOf(48);
         /* LastIndexOf() prints the last occurrence of the object and returns -1
        if value is not present in the list*/

//        System.out.println("First occurrence of value 48 is: "+first_index);
//        System.out.println("Last occurrence of value 48 is: "+last_index);


        /*peek() method*/


        int p=list2.peek(); /* used to just retrieve the head of the list
                                DOES NOT REMOVE IT FROM THE LIST*/

        int pF=list2.peekFirst(); /* used to just retrieve the first element
                                     of the list
                                DOES NOT REMOVE IT FROM THE LIST
                                and return null if list is empty */

        int pL=list2.peekLast(); /* used to just retrieve the last element
                                    of the list
                                   DOES NOT REMOVE IT FROM THE LIST
                                   and return null if list is empty */


//        System.out.println("LIST BEFORE PEEK:  "+list2);
//
//        System.out.println("HEAD of the linked list is: "+p);
//        System.out.println("First element of the linked list is: "+pF);
//        System.out.println("Last element of the linked list is: "+pL);
//
//        System.out.println("LIST AFTER PEEK:  "+list2);





        /*poll() method*/

//1. poll()
        System.out.println("LIST BEFORE POLL:  "+list2);

        int po=list2.poll(); /* used to just retrieve the head of the list
                                also, REMOVE IT FROM THE LIST*/
        System.out.println("HEAD of the linked list is: "+po);
        System.out.println("LIST AFTER POLL:  "+list2);


//2. pollFirst()
        System.out.println("LIST BEFORE POLL:  "+list2);
        int poF=list2.pollFirst(); /* used to just retrieve the first element
                                     of the list
                                     also, REMOVE IT FROM THE LIST*/
        System.out.println("First element of the linked list is: "+poF);
        System.out.println("LIST AFTER POLL FIRST:  "+list2);



// 3. pollLast()
        System.out.println("LIST BEFORE POLL:  "+list2);
        int poL=list2.pollLast(); /* used to just retrieve the last element
                                    of the list
                                   also,REMOVE IT FROM THE LIST*/

        System.out.println("Last element of the linked list is: "+poL);
        System.out.println("LIST AFTER POLL LAST:  "+list2);




        /*REMOVE() method*/


        //1.remove()
        /*used to remove HEAD of the list*/

        System.out.println("List before Removal is: "+list2);
        int r1=list2.remove();
        System.out.println("Removed value is: "+r1);
        System.out.println("List after Removal is: "+list2);

        //2.remove(int index)
        /* used to remove element from a specific index*/

        System.out.println("List before Removal is: "+list2);
        int r2=list2.remove(2);
        System.out.println("Removed value is: "+r2);
        System.out.println("List after Removal is: "+list2);

//        3.removeFirst()
        /* used to remove first element of the list*/

        System.out.println("List before Removal is: "+list2);
        int r4=list2.removeFirst();
        System.out.println("Removed value is: "+r4);
        System.out.println("List after Removal is: "+list2);

        //4.removeLast()
        /* used to remove last element of the list*/

        System.out.println("List before Removal is: "+list2);
        int r5=list2.removeLast();
        System.out.println("Removed value is: "+r5);
        System.out.println("List after Removal is: "+list2);


        //5.removeFirstOccurrence(Object o)
        /* used to remove first occurrence of the element in the list*/
        System.out.println("List before Removal is: "+list2);
        boolean r6=list2.removeFirstOccurrence(48);
        System.out.println("Removed value is: "+r6);
        System.out.println("List after Removal is: "+list2);

        //6.removeLastOccurrence(Object 0)
        /* used to remove last occurrence of the element in the list*/

        System.out.println("List before Removal is: "+list2);
        boolean r7=list2.removeLastOccurrence(36);
        System.out.println("Removed value is: "+r7);
        System.out.println("List after Removal is: "+list2);





//                         set method()
        /* set method is used to change the value at a
         specific index with some other value*/

        System.out.println("List before Removal is: "+list2);
        list2.set(3,1000);
        System.out.println("List after set method is: "+list2);



//        size() method
        /* used to find the number of elements in the list*/

        System.out.println("List is: "+list2);
        System.out.println("List after set method is: "+list2.size());


//        clear() method
        /*used to empty the list or simply we can say remove all elements from the list*/
        list2.clear();
        System.out.println("Empty list 2:"+list2);


//        clone() method
        /*used to make a exact copy of objects of the list which is known as cloning */

        System.out.println("LinkedList LIST 1 :" + list1);

        // Creating another linked list and copying
        LinkedList cloned_list = new LinkedList();
        cloned_list = (LinkedList) list1.clone();

        // Displaying the other linked list
        System.out.println("Cloned LinkedList is: " + cloned_list);
    }
    }



