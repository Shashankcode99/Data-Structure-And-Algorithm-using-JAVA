package ARRAY;
import java.util.HashSet;
import java.util.Scanner;
public class UNION_INTERSECTION_OF_ARRAY {

    static void UNION(int[] A1,int[] A2, int l1,int l2 )
    {
     HashSet <Integer> HSU= new HashSet<>();
        for(int i =0; i<l1 ; i++) {
           HSU.add(A1[i]) ;
        }

        for (int j = 0; j <l2 ; j++)
        {
        HSU.add(A2[j]);  //hash set automatically ignores duplicate value
        }

        System.out.println(HSU);
        }


    static void INTERSECTION(int[] A1,int [] A2, int l1,int l2 ) {
        HashSet<Integer> HS = new HashSet<>();
        HashSet<Integer> HSI = new HashSet<>();
        for (int i = 0; i < l1; i++) {
            HS.add(A1[i]);
        }
        for (int j = 0; j < l2; j++) {
            if (HS.contains(A2[j])) {
                HSI.add(A2[j]);
            }
        }
        System.out.println(HSI);
    }


        public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array 1:");
            int m=sc.nextInt();
            System.out.println("Enter size of array 2:");
            int n=sc.nextInt();

            int[] arr1 = new int[m];
            int[] arr2 =new int[n];

            System.out.println("Enter values of array 1:");
            for (int i = 0; i <m ; i++) {
                arr1[i]=sc.nextInt();
            }
            System.out.println("Enter values of array 1:");
            for (int j = 0; j <n; j++) {
                arr2[j]=sc.nextInt();
            }

            System.out.println("UNION OF THE ARRAY IS:");
            UNION(arr1, arr2, m, n);
            System.out.println("INTERSECTION OF THE ARRAY IS:");
            INTERSECTION(arr1, arr2, m, n);

        }
    }