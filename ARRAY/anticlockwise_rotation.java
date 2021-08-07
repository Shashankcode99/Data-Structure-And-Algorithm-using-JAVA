package ARRAY;
import java.util.Scanner;
public class anticlockwise_rotation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the Array: ");
        size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];
        System.out.println("Enter the values in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        anticlockwise_rotation obj=new anticlockwise_rotation();
        obj.anticlock_rotate(size,arr);
    }


    void anticlock_rotate(int len,int a[])
    {
        int lst=a[len-1];
        for (int i = len-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
        a[0]=lst;

        for (int k = 0; k < len; k++) {
            System.out.print(a[k]+"\t");
        }

    }
}
