package Java.Sorting;

public class HeapSort extends Sort {
//    //this code from lesson youtube(the new baghdad);
    static int total; //size heap
    static void heapIfy(int[]array,int parentindex){
      int leftChild = parentindex*2+1;// left child
      int rightChild = parentindex*2+2;//right child
      int newIndex = parentindex;//intialization a root
     if (leftChild<total && array[leftChild]>array[newIndex])
         newIndex=leftChild;
     if (rightChild<total && array[rightChild]>array[newIndex])
         newIndex=rightChild;

     if (newIndex!=parentindex){
         swap(array,parentindex,newIndex);
         heapIfy(array,newIndex);
     }
    }
    static void heapSort(int[]array) {
        total = array.length - 1;
        for (int i = total / 2; i >= 0; i--)
            heapIfy(array, i);
        for (int i = total; i >= 0; i--) {
            swap(array, 0, i);
            total--;
            heapIfy(array, 0);
        }
    }
    public static void main(String[]args){
        System.out.println("Before sort arra element are: ");
        printArray(sortArray);
        System.out.println("\n After sort array element are: ");
        heapSort(sortArray);
        printArray(sortArray);
    }



}
