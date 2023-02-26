package Java.Search.BinearySearch;

public class binearySearch {
    public static int BinearySearch(int []x,int low,int hight,int num){
        int mide = low+(hight-low)/2;
        boolean isFound = false;
        int numberTry=0;
        while (!isFound) {
            if (low > hight) {
                System.out.println("number is not found");
                break;
            }
            numberTry++;
            if (x[mide]==num){
                System.out.println("numbe is found");
                System.out.println("number is found after: " + numberTry);
                break;
            }
            if (x[mide]<num){
                low=mide+1;
            }else if (x[mide]<hight){
                hight = mide-1;
            }
        }
        return mide;
    }

    public static void main(String[]args){
        int[] numbers = {10,60,70,9,100,78,2136,0,132,63,23,435,76};
        System.out.println("found number in: " + BinearySearch(numbers,0,numbers.length,0));
    }
}
