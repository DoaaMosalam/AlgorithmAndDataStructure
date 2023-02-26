package Java.Revision;

public  class Arraystructure {
    private static int[] array = new int[50];
    private static int sizeArray =10;

    public static void printarray() {
        System.out.println("----------");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("| " + i + " |");
            System.out.println(array[i] + " |");
            System.out.println("----------");
        }
    }

    public static void generateRandomArray(){
        for (int i =0;i<sizeArray;i++){
            array[i] = (int) (Math.random()*10)+10;
        }
        printarray();
    }
    //this Mathod return number by input index.

    public static int getValueAtIndex(int index){
        if (sizeArray < index){
            System.out.println("index is: " + index + "return element in array is: " + array[index]);
        }
        return array[index];
    }

    public static boolean doesarraycontainsThisValue(int searchValue){
        boolean value = false;
        for (int i=0;i<sizeArray;i++){
            if (array[i] == searchValue){
                value = true;
            }
        }
        return value;
    }
    //this method delete element in array.
    public static void deleteArray(int index){
        if (index < sizeArray){
            for (int i = 0; i <(sizeArray-1) ; i++) {
                array[i] = array[i+1];
            }
            sizeArray--;
            System.out.println("delet index: " + index);

        }
    }

    //This method add element in array.
        public static void insertElementInArray(int value) {
            if (sizeArray < 50) {
                array[sizeArray] = value;
                sizeArray++;
            }
        }

        //this  method Linear Java.Search.Java.Search
    public static String linearSearch(int value){
       // this  Considered quation  about Value ina array.
        boolean valueInArray = false;
        String indexWithValue =" " ;
        System.out.println("The value wad found in the following: ");
        for (int i=0;i<sizeArray;i++){
            if (array[i]==value){
                valueInArray = true;
                System.out.println(i + " ");
                indexWithValue+=i +" ";
            }
        }
        if (!valueInArray){
            indexWithValue = "None";
            System.out.println(indexWithValue);
        }
        System.out.println();
        return indexWithValue;


    }

            public static void main (String[] args) {
                generateRandomArray();
                System.out.println(getValueAtIndex(3));
                System.out.println("Value fount : " + doesarraycontainsThisValue(17));

//                deleteArray(4);
//                System.out.println("++++++++++++++++++++++++++++++++++");
//                printarray();
//                System.out.println("----------------------------------------------------------");
//                System.out.println("inset Element: ");
//                insertElementInArray(13213123);
                System.out.println("----------------------------------------------------------");
                printarray();
                System.out.println("===============================================");
                linearSearch(17);
            }
}
