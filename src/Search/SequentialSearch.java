package Search;

public class SequentialSearch {
    private static int[] numList = {21,15,90,11,18,1025,105,6,12};
//The sequential search (Linear search) unsorting search.
    public static int sequential(int number){
        boolean status = false;
        int tryNumber = 0;
        int i =0;
        for ( ; i <numList.length ; i++) {
            if (numList[i] == number) {
                status=true;
                tryNumber++;
                System.out.println("Number found in list " + i + " Count number try is: " + tryNumber);
            }
        }
        System.out.println(status);
        return i;
    }

    public static void main(String[]args){
        sequential(12);
    }
}
