import java.util.Arrays;

/**
 * Created by m785451 on 9/11/17.
 */
public class isAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram.isAnagram("cat", "tacy"));
    }

    public static boolean isAnagram(String s , String t){

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);

    }
}
