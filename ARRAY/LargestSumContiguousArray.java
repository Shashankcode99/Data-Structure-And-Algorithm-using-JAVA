                                        //<<<<<<<<VERY VERY IMPORTANT>>>>>>>>>

                                        // Here we are Using KADENS ALGORITHM

//<<MUST READ>>  Explanation of the algo: in this algorithm we start traversing the array from 1st element and store the value in the
//                        a variable. Going further in the array if the su of the values is greater than the
//                        previous sum then we change the maximum value  to that sum but if the sum is negative
//                        or we can say less than 0,then we are not going to add that as it will only decrease the value
//                        of the maximum sum and finally we initialise the current value zero(0) .


package ARRAY;
import java.util.Scanner;
public class LargestSumContiguousArray {
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
        LargestSumContiguousArray obj = new LargestSumContiguousArray();
        int result = obj.largest_sum_subarray(size, a);
        System.out.println("Maximum sum of the array is: " + result);
    }


    int largest_sum_subarray(int len, int arr[]) {
        int curr_val = 0;
        int max_sum = 0;
        for (int i = 0; i < len; i++) {
            curr_val = curr_val + arr[i];
            if (curr_val > max_sum) {
                max_sum = curr_val;
            }
            if (curr_val < 0)
        {
                curr_val = 0;
            }
        }
        return max_sum;
    }

}