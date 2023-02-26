package Java.Sorting;

public class QuickSort extends Sort{
    static void quickSort(int[]array,int low,int hight){
        int middle = low+(hight-low)/2;
        int i=low;
        int j = hight;
        int pivot = array[middle];
        while (i<=j){
            while (array[i]<pivot){
                i++;
            }
            while (array[j]>pivot){
                j--;
            }
            if (i<=j){
                swap(array,i,j);
                i++;
                j--;
            }
        }
        if (low<j)
            quickSort(array, low, j);
        if (hight>i)
            quickSort(array,i,hight);
    }


    public static void main(String[]args){
        System.out.println("\n before sort array element are: ");
        printArray(sortArray);
        System.out.println("\n After sort array element are: ");
        quickSort(sortArray,0,sizeArray-1);
        printArray(sortArray);

    }

}
