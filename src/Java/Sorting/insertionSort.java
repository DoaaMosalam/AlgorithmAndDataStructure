package Java.Sorting;

public class insertionSort extends Sort {
    //this is big o^

    public static int[] insertionSort(int[]array) {
        for (int step = 1; step < sizeArray; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;

        }
        return printArray(array);
    }

    public static void main(String[]args){
        insertionSort(sortArray);

    }
}
