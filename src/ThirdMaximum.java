/**
 * Created by Badri on 8/5/17.
 */

import java.util.TreeSet;

public class ThirdMaximum {

    public static void main(String[] args) {
        System.out.println(ThirdMaximum.thirdMax(new int[] {3,2,10,0}));
    }


    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums) {
            set.add(num);
            if(set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }
}
