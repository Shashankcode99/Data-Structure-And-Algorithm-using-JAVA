package ARRAY;
import java.util.Scanner;
public class reverse_Array {
    public static void main(String[] args) {
        int size, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        int[] revArray = new int[size];

        System.out.println("Enter the values int array");
        for (int i = 0; i < size; i++) {
            revArray[i] = sc.nextInt();
        }

        System.out.println("Reverse of the Array");
        int lst=(size-1);
        for (int i = 0; i < size/2; i++) {
            temp = revArray[i];
            revArray[i] = revArray[lst];
            revArray[lst] = temp;
            lst--;
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(revArray[i] + "\t");

        }
    }

}