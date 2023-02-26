package Java.Recursion;

public class Recursion {
    static int count =0;

    public static int recursion(int n) {
        if (n == 1 || n == 0) {
            return -1;
        } else {
            return n * recursion(n - 1);
            /* 5 * rec(4) // 24 * 5 = 120
                      4 * rec(3) //6 * 4 = 24
                           3 * rec(2) //2 *3 = 6
                                2 * recc(1) // 2
                                           1 base case..
             */
        }
    }

    public static int fibonacci(int n){
        /*
            0 1 2 3 4 5 6  7  8     9   10 ..etc
            0 1 1 2 3 5 8 13 21 24  55 ...etc
         */
        if (n==0|| n==1){
            return n;
        }else {
            return   fibonacci(n-1) + fibonacci(n-2);
        }
    }
    static int n1=0,n2=1,n3;
    public static void printFibo(int n){
        if (n>0){
            n3 = n1 +n2;
            n1=n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(n-1);

        }
    }

    public static int sumBetweennumber(int n1, int n2){
        if (n1==n2){
            return n1;
        }else {
            if (n1<n2)
                return n1 + sumBetweennumber(n1 + 1, n2);
            else
                return  n1 + sumBetweennumber(n1-1,n2);
        }

    }

    public static void main(String[]args){
        //        System.out.println(recursion(5));
        System.out.println("Fib: " + fibonacci(4));

           /* System.out.println("print Fibonacci series full: " );
            System.out.print(n1 + " " + n2);
            int num = 10;
            printFibo(num-1);*/

        //    System.out.println(sumBetweennumber(4,6 ));
    }
}
