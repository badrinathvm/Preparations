/**
 * Created by Badri on 7/21/17.
 */
public class Palindromes {

    public static void main(String[] args) {


        System.out.println(Palindromes.LongestPalindrome("aba"));
        System.out.println(Palindromes.shortestPalindrome("abcd"));

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

    public static String shortestPalindrome(String s){
        if(s == null || s.length() == 0) return null;
        if(s.length() == 1) return s;

        int i = 0;
        int j = s.length()-1;

        while(j>=0){
            if (s.charAt(i) == s.charAt(j)){
                i++;
            }
            j--;
        }

        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        return prefix+mid+suffix;
    }
}
