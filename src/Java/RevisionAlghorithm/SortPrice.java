package Java.RevisionAlghorithm;

import java.io.IOException;

public class SortPrice extends TotalPrice {

    public static void selectionSort(int[] x) {
       int midIndex;
        for (int i = 0; i <x.length-1 ; i++) {
            midIndex=i;
            for (int j = i+1; j <x.length ; j++) {
                if (x[i]>x[midIndex]){
                    midIndex=j;
                }
            }
            swap(x,i,midIndex);
        }
        printArray(x);
        // return x;
    }
    public static void  main(String[]args) throws IOException {
        int[] data = readFile("Total Sales.txt");
        System.out.println(data);
        System.out.println(" ");
        selectionSort(data);
    }
}
