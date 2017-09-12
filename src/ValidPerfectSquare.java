/**
 * Created by m785451 on 9/11/17.
 */
public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(ValidPerfectSquare.validPerfectSquare(16));
        System.out.println(ValidPerfectSquare.validPerfectSquare(14));
    }

    public static boolean validPerfectSquare(int num){

        if(num == 1) return true;

        long low = 1, high = num/2;

        while (low <= high){

            long mid = (low + high)/2;

            if(mid * mid == num){
                return true;
            }else if (mid * mid < num){
                low = mid+1;
            }else{
                high = mid -1 ;
            }
        }

        return false;
    }
}
