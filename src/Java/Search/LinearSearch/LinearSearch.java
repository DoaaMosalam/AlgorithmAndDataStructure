package Java.Search.LinearSearch;

import java.util.Arrays;

public class LinearSearch {
    public static boolean linearSearch(int[] x, int num) {
//        int  loction = Arrays.binarySearch(x,num);
//        if (loction>=0){
//            System.out.println("fount number in location " + loction);
//        }
        int index;
        int numberTry=0;
        boolean status = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == num) {
                status = true;
                numberTry ++;
                System.out.println("found number: " + num + " in index: " + i);
                System.out.println("found number after try " + numberTry);
            }
        }
        return status;
    }

    public static void main(String[] args) {
        int[] array = {23,66,80,78,34,92,16};
        linearSearch(array,16);
    }
}
