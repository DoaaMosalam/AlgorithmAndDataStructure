package Java.Search;

import java.util.stream.IntStream;

public class Search {
    //  private static final int[] array = {23,66,80,78,34,92,16};
    private final static int[] array = {1, 2, 4, 8, 10, 12, 16};
    static int sizeArray = array.length;
    //this mehod return minmum number in array.
    public static int smallNumber(int[]x){
      int minMum = x[0];
        for (int i = 0; i <x.length ; i++) {
            if (x[i]<minMum){
                minMum = x[i];
            }
        }

        return minMum;
    }

    public static int largestNumber(int[]x){
        int maxMum = x[0];
        int i=0;
        for ( i = 0; i <x.length ; i++) {
            if (x[i]> maxMum){
                maxMum = x[i];
            }
        }
        System.out.println("found larges number is: " + maxMum + " index of: " +i );
        return maxMum;

    }

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

    public static int mideBineaySearch(int[] x,int low,int hight,int num)  {
       int  mide=low+(hight-low)/2;
       boolean isFound=false;
       int numberTry = 0;

        while (!isFound){
            if (low>hight){
                System.out.println("Number is not found....");
                break;
            }
            numberTry++;
            if (x[mide]==num){
                System.out.println("numbe is found");
                System.out.println("number is found after: " + numberTry);
                break;
            }
            if (x[mide]<num){
                low=mide+1;
            }else if (x[mide]>num){
                hight = mide-1;
            }
        }
        return mide;
    }
//this method found number by used index in array (java 8 stream).
    public static  void getNumbeByIndex(int[]x,int elementToFind){
      //  int[] array1 = {1, 3, 5, 7, 9};

     //   int elementToFind = 3;

        int indexOfElement = IntStream.range(0, x.length).
                filter(i -> elementToFind == x[i]).
                findFirst().orElse(-1);

        System.out.println("Index of " + elementToFind + " is " + indexOfElement);

    }

    public static void sorted(int[]x){
//     Arrays.sort(x);
//        for (int value :x) {
//            System.out.printf("%d ",value);
//        }
    }


}
