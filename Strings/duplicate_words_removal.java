package Strings;
import java.util.Scanner;
public class duplicate_words_removal {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string with duplicate words:");
        String str=sc.nextLine();


        String[] word_Array=str.split(" ");
String finalst="";
        for (int i = 0; i < word_Array.length ; i++)
        {
            for (int j = 0; j < word_Array.length ; j++) {
                if(word_Array[i].equals(word_Array[j]))
                {
                    if(i!=j)
                    {
                       word_Array[j]="";
                    }
                }
            }
        }
        for (int i = 0; i < word_Array.length ; i++) {
            if(!word_Array[i].equals(""))
            {
                finalst=finalst.concat(word_Array[i]+" ");
            }
        }
        System.out.print(finalst);

    }
}