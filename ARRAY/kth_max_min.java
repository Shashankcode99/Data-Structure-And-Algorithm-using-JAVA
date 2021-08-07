
package ARRAY;
import java.util.Scanner;
public class kth_max_min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, size;
        System.out.println("Enter the kth value\n");
        k = sc.nextInt();

        System.out.println("Enter the size of the Array\n");
        size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the values of the Array:\n");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        kth_max_min obj=new kth_max_min();

        System.out.println("Kth Maximum Number of the array is:- "+obj.max(k,size,a));
        System.out.println("Kth Minimum Number of the array is:- "+obj.min(k,size,a));
    }
//    MAXIMUM ELEMENT FUNCTION
        int max(int pos,int len,int arr[])
        {
            int j;
            for (j = 0; j <pos; j++) {
                for (int l = j + 1; l < len; l++) {
                    if (arr[j] < arr[l]) {
                        int temp = arr[j];
                        arr[j] = arr[l];
                        arr[l] = temp;
                    }
                }
            }
             int rmax=arr[j - 1];
            return rmax;
        }
//MINIMUM ELEMENT FUNCTION
        int min(int pos,int len,int arr[])
        {
            int j;
            for (j = 0; j < pos; j++) {
                for (int l = j + 1; l < len; l++) {
                    if (arr[j] > arr[l]) {
                        int temp = arr[j];
                        arr[j] = arr[l];
                        arr[l] = temp;
                    }
                }
            }
            int rmin=arr[j - 1];
            return rmin;

        }
    }











