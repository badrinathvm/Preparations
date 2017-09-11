/**
 * Created by Badri on 9/10/17.
 */
public class ClimbingStairs {

//Reference : http://www.geeksforgeeks.org/count-ways-reach-nth-stair/

    //bascially the no of ways is ways(1) = fib (1 + 1)
    public static void main(String[] args) {
        System.out.println("No of ways is " + ClimbingStairs.countWays(4));
    }

    public static int countWays(int n){
        return fib(n+1);
    }

    public static int fib(int n){
        if ( n <= 1){
            return n;
        }else{
            return fib(n-1) + fib (n-2);
        }
    }
}
