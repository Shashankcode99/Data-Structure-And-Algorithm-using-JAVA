package Searching_Algorithms;
import java.util.Scanner;
public class Linear_Search {

    public static int lnr_search(int[] arr,int element)
    {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int[] searched_array=new int[size];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i <size ; i++) {
            searched_array[i] =sc.nextInt();
        }

        System.out.println("Enter the value to be searched");
        int value=sc.nextInt();


        int result=lnr_search(searched_array,value);

        if(result==-1)
        {
            System.out.println("SEARCH FAILED:: Element Not Found");
        }
        else
        {
            System.out.println("Element "+value+" found at index "+result);
        }
    }
}
