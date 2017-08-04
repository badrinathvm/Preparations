/**
 * Created by Badri on 8/2/17.
 */

import java.util.*;

public class DistinctSubStrings {
    public static void main(String[] args) {

        System.out.println(DistinctSubStrings.getAllUniqueSubset("aaray"));
    }


    public static ArrayList<String> getAllUniqueSubset(String str) {
        ArrayList<String> set = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - i; j++) {
                String elem = str.substring(j, j + (i+1));
                if (!set.contains(elem)) {
                    set.add(elem);
                }
            }
        }
        return set;
    }
}
