package ARRAY;
import java.util.Scanner;
public class duplicate_element
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size;

            System.out.println("Enter the size of the Array\n");
            size = sc.nextInt();

            int a[] = new int[size];

            System.out.println("Enter the values of the Array:\n");
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            duplicate_element obj=new duplicate_element();
            System.out.println("Duplicate element of the array is:- "+obj.find_duplicate(size,a));

        }

        int find_duplicate(int len,int arr[])
        {
            int i=0;
            for ( i = 0; i <len-2; i++) {
                for (int j = i+1; j <len ; j++) {
                    if(arr[i]==arr[j])
                    {
                        break;
                    }
                }

            }
            return arr[i];
        }
}




