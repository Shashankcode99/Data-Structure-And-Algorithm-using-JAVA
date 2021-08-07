package ARRAY;

import java.util.Scanner;

public class minimum_jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of the Array\n");
        size = sc.nextInt();

        int []a = new int[size];

        System.out.println("Enter the values of the Array:\n");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        minimum_jumps obj=new minimum_jumps();
        System.out.println("Minimum Number of Jumps are: "+obj.mim_jump(a,size));
    }

    int mim_jump(int []arr,int len) {
        int jump_count = 0;
        int i = 0;
        while(i<len)
        {
            if (arr[0] == 0)  {
                jump_count=jump_count-1;
            }
            else if( i == len- 1 || arr[i+1]==0)
            {
                break;
            }
            else {
                i = arr[i] + i;
                jump_count++;
            }

        }
        return jump_count;
    }
}












