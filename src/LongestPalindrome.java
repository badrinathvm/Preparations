/**
 * Created by Badri on 7/21/17.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(LongestPalindrome.LongestPalindrome("aba"));
    }

    public static String LongestPalindrome(String s) {
        if(s == null || s.length() == 0) return null;
        if(s.length() == 1) return s;

        StringBuilder longestPalin = new StringBuilder();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                StringBuilder sb = new StringBuilder(s.substring(i, j));
                //System.out.println(sb);
                if (sb.toString().equals(sb.reverse().toString()) && sb.toString().length() > max) {
                    //longestPalin.setLength(0);
                    longestPalin.append(sb.toString());
                    max = sb.toString().length();
                }
            }
        }
        System.out.println(max);
        return  longestPalin.toString();
    }
}
