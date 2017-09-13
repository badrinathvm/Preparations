package src;

/**
 * Created by m785451 on 9/12/17.
 */
public class ValidWordAbbreviation {

    public static void main(String[] args) {

        System.out.println(ValidWordAbbreviation.validWordAbbrevation("internationalization","i12iz4n"));
        System.out.println(ValidWordAbbreviation.validWordAbbrevation("apple","a2e"));

    }

    public static boolean validWordAbbrevation(String word, String abbr) {
        int i = 0, j = 0;

        while (i < word.length() && j < abbr.length()) {
            if (word.charAt(i) == abbr.charAt(j)) {
                ++i;
                ++j;
                continue;
            }

            if (abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') {
                return false;
            }

            int start = j;

            while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
                ++j;
            }

            int num = Integer.valueOf(abbr.substring(start, j));
            i += num;
        }
        return i == word.length() && j == abbr.length();
    }


}
