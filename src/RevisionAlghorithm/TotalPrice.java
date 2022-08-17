package RevisionAlghorithm;

import java.io.*;
import java.util.Scanner;

public abstract class TotalPrice {
    static int[] prices;
    int sizePrices = prices.length;

    //this method print integer array.
    static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+ array[i]);
        }
        return array;
    }

    //this method read file xbout total price txt.
    static int[] readFile(String fileName) throws IOException {
        final String path = "D:\\Coders Programming\\Java\\Private Project\\Algorithm and Data Structure\\data\\" + fileName;
       Scanner sc = new Scanner(new FileReader(path));
        prices = new int[sc.nextInt()];
       while (sc.hasNext()){
           System.out.print(" " +sc.next());
       }
       return prices;
    }
    //This method swap.
    static void swap(int[]array,int i,int y){
        int temp = array[i];
        array[i] = array[y];
        array[y] = temp;
    }
}
