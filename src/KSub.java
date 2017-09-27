import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by m785451 on 9/15/17.
 */
public class KSub {


    public static void main(String[] args) {
        int arr[] = {3,5,1,2,3,4,1};
        //System.out.println(KSub.subCount(arr,3));


        System.out.println(KSub.intToBinary(77));
       // System.out.println(KSub.SubArraySumModK(arr, 3)[1]);
    }


    public static int intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }


        return 0;
        //return  Character.toString((char) s.charAt(4));
    }

    public static int[] SubArraySumModK(final int A[], final int K) {
        int sum = 0;
        final Map<Integer, Integer> candidates = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (!candidates.containsKey(sum % K)) {
                candidates.put(sum % K, i);
            } else {
                // a subarray found
                return Arrays.copyOfRange(A, candidates.get(sum % K) + 1, i + 1);
            }
        }
        return null;
    }


    static long subCount(int nums[],int k)
    {

        int [] sum = new int[nums.length];
        long count = 0;
        sum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }

        int [] kVal = new int[k];

        for(int i = 0; i < sum.length; i++){
            int mod = sum[i] % k;

            if(mod == 0)
                count++;

            count += kVal[mod];
            kVal[mod] += 1;

        }
        return count;
    }



}
