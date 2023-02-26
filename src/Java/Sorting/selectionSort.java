package Java.Sorting;

public class selectionSort extends Sort{
    //this is big o^
// 0       1         2               3               4           5
// 29     10      30             7               1           9
    public static void selectionSortArray(int[] x) {

        int minDex;
        int max=0;
        for (int i = 0; i < x.length - 1; i++) {
            minDex = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[minDex]) {
                    minDex = j;
                }
//                if (x[i] > max){
//                    max = x[i];
//                }
            }
            swap(x,i,minDex);
        }
        System.out.println("Mixmum number is: " + max);
        printArray(x);
    }

    public static void swap(int[]array,int i,int y){
        int temp = array[i];
        array[i] = array[y];
        array[y] = temp;
    }


    public static void main(String[]args){
//        int sizeArray = selectArray.length / selectArray[0];
        System.out.println("Before Selection Sort: ");
        printArray(sortArray);
        System.out.println();
        System.out.println("After Selection Sort: ");
       selectionSortArray(sortArray );
    }



}
