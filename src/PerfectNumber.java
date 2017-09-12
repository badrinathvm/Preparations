/**
 * Created by Badri on 9/11/17.
 */
public class PerfectNumber {


//    Input: 28
//    Output: True
//    Explanation: 28 = 1 + 2 + 4 + 7 + 14


    public static void main(String[] args) {
        System.out.println(PerfectNumber.checkPerfectNumber(28));

        System.out.println(PerfectNumber.checkPerfectNumber(29));
    }


    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        sum++;

        return sum == num;
    }
}
