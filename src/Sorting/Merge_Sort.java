package Sorting;

public class Merge_Sort extends Sort {

    void doMerge(int[]a,int beg,int end){
        if (beg<end) {
            int middle = (beg + end) / 2;
            doMerge(a, beg, middle);
            doMerge(a, middle + 1, end);
            mergeSort(a,beg,middle,end);
        }
    }

    void mergeSort(int[]a,int beg,int middle,int end){
        int i, j, k;
        int n1 = middle - beg + 1;
        int n2 = end - middle;

        /* temporary Arrays */
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[middle + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }
    public static void main (String[]args){
        Merge_Sort merge = new Merge_Sort();
        System.out.println("Befory merge sorting array element are: ");
        printArray(sortArray);
        System.out.println("\n After merge sorting array element arae: ");
        merge.doMerge(sortArray,0,sizeArray-1);
        printArray(sortArray);

    }

}