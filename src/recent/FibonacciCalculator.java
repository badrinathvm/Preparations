package recent;

/**
 * Created by Badri on 9/22/17.
 */
 public class FibonacciCalculator {

    public static void main(String args[]) {

        int number = 2;

        for(int i=1; i<=number; i++){
            System.out.print(fib(i) +" ");
        }

        System.out.println(" ");

        for(int i=1; i<=number; i++){
            System.out.print(fibUsingRecursion(i) +" ");
        }
    }

    public static int fib(int number){

        if( number == 1 || number ==2){
            return 1;
        }

        int fib0 = 1, fib1 = 1, result = 1;

        for ( int i = 3; i<=number; i++){
            result = fib0 + fib1;
            fib0 = fib1;
            fib1 = result;
        }

        return result;

    }


    public static int fibUsingRecursion(int number){

        if( number == 1 || number ==2){
            return 1;
        }

        return fibUsingRecursion(number-1) + fibUsingRecursion(number-2);

    }

}