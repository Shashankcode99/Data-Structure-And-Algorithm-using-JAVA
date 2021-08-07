package ARRAY;
import java.util.*;
public class max_min_of_array {

    static void max(int[] a) {
        int mx = a[0];
        for (int i = 0;i<a.length; i++) {
            if (a[i] >= mx) {
                mx = a[i];
            }
        }
        System.out.println("Maximum element of the array is:"+mx);
    }

    static void min(int[] a) {
        int mi = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= mi) {
                mi = a[i];
            }
        }
        System.out.println("Maximum element of the array is:"+mi);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of element in the array:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter values of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       max(arr);
       min(arr);


    }
}