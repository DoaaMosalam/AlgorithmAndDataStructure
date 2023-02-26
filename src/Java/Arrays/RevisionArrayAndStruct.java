package Java.Arrays;

import java.util.Scanner;

public class RevisionArrayAndStruct {
    //طباعه اراي يكون عناصرها من ادخال المستخدم
    public static int[] Array (){
        Scanner input = new Scanner(System.in);
        int s;
        System.out.println("Enter size Array: ");
        s = input.nextInt();
        int[]array = new int[s];
        for (int i = 0; i < s ; i++) {
            System.out.print("Enter number of array index is : " + i + " : " );
//            int numarray = input.nextInt();
            array[i] = input.nextInt();
        }
        return printArray(array);
    }

    public static int[] printArray(int[]x){
        for (int i = 0; i <x.length ; i++) {
            System.out.println( i + " | " + x[i]); ;
        }
        return x;
    }





    public static void main(String[]args){
        Array();

    }
}
