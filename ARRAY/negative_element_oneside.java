package ARRAY;
import java.util.Scanner;
public class negative_element_oneside {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the Array: ");
        size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];
        System.out.println("Enter the values in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        negative_element_oneside obj = new negative_element_oneside();
        obj.left_side(size, arr);

        obj.right_side(size, arr);
    }
//All the elements left side of the array

    void left_side(int len, int[] a) {

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (a[j] >=0) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int m = 0; m < len; m++) {
            System.out.println("The array is as follows:" + a[m]);
        }
    }

//
//All the elements right side of the array

        void right_side ( int len, int[] a){

            for (int i = 0; i < len; i++) {
                for (int j = len - 1; j > 0; j--) {

                    if (a[j] >= 0) {
                        int temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }
            System.out.println("\n");
            for (int k = 0; k < len; k++) {
                System.out.println("The array is as follows:" + a[k]);
            }
        }
}


