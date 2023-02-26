package Java.RevisionAlghorithm;

import java.io.IOException;

public class SearchPrices extends TotalPrice {
    //this method search largest number.
    static int liargestNumber(int[]array){
        int index=0;
        int max = array[index];
        for (; index <array.length ; index++) {
            if (array[index]>max)
                max=array[index];
        }
        System.out.println("Found max number" + max +" in index: " + index );
        return max;
    }
    //This method seach number about linear search..
    static boolean searchNumber(int[]array, double num){
        boolean status=false;
        int index=0;
        for (; index <array.length ; index++) {
            if (array[index]==num)
                status= true;

        }
        System.out.println("found number: " +num + " in index: " + index);
        return status;

    }

    public static void selectionSort(int[]x){
        int midIndex;
        for (int i = 0; i <x.length-1 ; i++) {
            midIndex=i;
            for (int j = i+1; j <x.length ; j++) {
                if (x[j]>x[midIndex]){
                    midIndex=j;
                }
            }
            swap(x,i,midIndex);
        }
        printArray(x);
    }

    public static void main(String[]args) throws IOException {
        int[] data = readFile("Total Sales.txt");
        System.out.println(data);
        System.out.println("===========================================");
        System.out.println(liargestNumber(data));
        System.out.println("=======================================");
        System.out.println(searchNumber(data,  63.24));
        System.out.println("===============================================");
        selectionSort(data);


    }

}
