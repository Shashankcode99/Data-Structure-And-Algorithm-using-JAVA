package ARRAY;
public class sorting_0_1_2_array {

//printing output
    static void printArray(int[] arr1) {
        for (int j : arr1) {
            System.out.print(j + "\t");
        }
    }

//sorting
    static void sorting(int[] arr1) {
        int count_1 = 0;
        int count_2 = 0;
        int count_0 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                count_0 = count_0 + 1;
            } else if (arr1[i] == 1) {
                count_1 = count_1 + 1;
            } else {
                count_2 = count_2 + 1;
            }
        }

      /* running loop for the count of 0 and inputting value 0
      in array until the count of 0's becomes zero */
        int j = 0;
        while (count_0 > 0) {
            arr1[j++] = 0;
            count_0--;
        }
 /* running loop for the count of 1 and inputting vale 1
      in array until the count of 1's becomes zero*/
        while (count_1 > 0) {
            arr1[j++] = 1;
            count_1--;
        }
/* running loop for the count of 2 and inputting value 2
      in array until the count of 2's becomes zero */
        while (count_2 > 0) {
            arr1[j++] = 2;
            count_2--;
        }

        printArray(arr1);  //calling printarray() function for printing the final output array
    }
    public static void main(String[] args)
        {
            int[] arr={2,1,0,2,2,1,0,0,1,0,2,1,1,0,2,1,0};
            sorting(arr);

        }
    }





