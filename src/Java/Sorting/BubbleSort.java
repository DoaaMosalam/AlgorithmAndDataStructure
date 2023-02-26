package Java.Sorting;

public class BubbleSort extends Sort {
    //sort array way bubble sort.
    //this is big o^
    public static int[] bubbleSort(int[]array){
        for (int i = 0; i <sizeArray ; i++) {
            for (int j = 0; j <sizeArray-1 ; j++) {
                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return printArray(array);
    }


    //This method sort array way selection sort.
    public static int[] selectionSort(int[]array){
        int midIndex;
        for (int i = 0; i <sizeArray-1 ; i++) {
            midIndex=i;
            for (int j = i; j <sizeArray ; j++) {
                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j]>array[midIndex]){
                    midIndex=j;
                }
            }
            swap(array,i,midIndex);
        }
        return printArray(array);
    }

    public static void swap(int[]array,int i,int y){
        int temp = array[i];
        array[i] =array[y];
        array[y] = temp;
    }

    public static void main (String[]args){

            System.out.println("Befor sorting Array: ");
            printArray(sortArray);
            System.out.println();
            System.out.println("\n after selection sort array:" );
             selectionSort(sortArray);


            System.out.println("\nAfter Bubble Sort array: ");
            bubbleSort(sortArray);
        }

}
