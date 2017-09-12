import java.util.Arrays;

/**
 * Created by m785451 on 9/11/17.
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(MajorityElement.majorityElement(new int []{1, 2, 3, 3, 3, 3, 10}));
    }

    public static int majorityElement(int [] arr){
        if ( arr.length == 1){
            return arr[0];
        }

        Arrays.sort(arr);
        return arr[arr.length/2];
    }


}
