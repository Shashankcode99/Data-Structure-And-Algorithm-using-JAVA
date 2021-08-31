/* The main point for binary search is that the array should be sorted*/

package Searching_Algorithms;
import java.util.*;

public class binary_Search {

    //actual searching function
    static int search(int[] arr, int low, int high,int element)
    {
        int mid;
        while(low<=high)
        {
         mid=(low+high)/2; //middle point of the array

            if(arr[mid]==element) {
                return mid;
            }

            else if (element<arr[mid])
            {
             return search(arr,low,mid-1,element); //recursively calling the function
            }

            else
            {
                return search(arr,mid+1,high,element); //recursively calling the function
            }
        }
return -1;

    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

//Size of the Array
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int[] array=new int[size];

//Array values input
        System.out.println("Enter the value of the array");
        for (int i = 0; i <size ; i++) {
          array[i]=sc.nextInt();
        }
//Input value to be searched
        System.out.println("Enter the value to be searched ");
        int value=sc.nextInt();


//Determining start point and end point of the array
          int start=0;
          int end=size-1;

//Storing the return value from the "search" function
          int result=search(array,start,end,value);


if (result==-1)
{
    System.out.println("SEARCH FAILED:: Element Not Found");
}
else
{
    System.out.println("Element "+value+" found at index: "+result);
}

    }

}
