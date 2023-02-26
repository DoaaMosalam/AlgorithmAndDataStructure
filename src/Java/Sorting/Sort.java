package Java.Sorting;

public abstract class Sort {
    final static int[] sortArray = {29,10,30,7,1,9,10,-6};
    final static int sizeArray = sortArray.length;
    //this method print integer array.
    public static int[] printArray(int[]x){
        for (int i = 0; i <x.length ; i++) {
            System.out.printf("%d ",x[i]);
        }
        return x;
    }
    //this method swap element in array.
    public static void swap(int[]array,int i,int y){
        int temp = array[i];
        array[i] = array[y];
        array[y]=temp;
    }
}
