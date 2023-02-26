package Java.Sorting;

public class mergeSort {
     public static int[] sortArray = {29,10,30,7,1,9,10,-6};

    public  int[] printArray(int[]x){
        for (int i = 0; i <x.length ; i++) {
            System.out.printf("%d ",x[i]);
        }
        return x;
    }
    static int[]array;
    static int[]tempArray;

     void prepareForSort(int[]array){
        array =array;
        tempArray = new int[array.length];
        doMerge(0,array.length-1);

    }
    //divid to simple problem.
     void doMerge(int lowIndex,int hightIndex){
        // ex:to 0 from 5(low index)
        //ex to 6 from 10 (hight index)
        if (lowIndex<hightIndex) {
            int middle = lowIndex + (hightIndex - lowIndex) / 2;
            doMerge(lowIndex, middle); // ex:to 0 from 5.
            doMerge(middle + 1, hightIndex); //ex to 6 from 10.
            //This to merge array after divid to simple problem.
            mergePart(lowIndex,middle,hightIndex);
        }
    }

     void mergePart(int lowerIndex,int middle,int hightIndex){
        for (int i = lowerIndex; i <=hightIndex ; i++) {
            tempArray[i]=array[i];
             i = lowerIndex;
             int j = middle+1;
             int k = lowerIndex;
             while (i<=middle && j <=hightIndex ){
                 if (tempArray[i]<= tempArray[j]){
                     array[k] = array[i];
                     i++;
                 }else {
                     array[k] = tempArray[j];
                     j++;
                 }
                 k++;
             }
             while (i<=middle){
                 array[k] = tempArray[i];
                 k++;
                 i++;
             }
        }
    }


    public static void main(String[]args){
         //mergeSort merge = new mergeSort();
        System.out.println("\nBefor merge sort array: ");
        new mergeSort().printArray(sortArray);
       new mergeSort().prepareForSort(sortArray);
        System.out.println("\nAfter merge sort array: ");

        new mergeSort().printArray(sortArray);

    }

}
