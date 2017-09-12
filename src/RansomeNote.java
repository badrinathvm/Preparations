/**
 * Created by Badri on 9/11/17.
 */
public class RansomeNote {

    public static void main(String[] args) {

        System.out.println(RansomeNote.canConstruct("aa","aab"));
        System.out.println(RansomeNote.canConstruct("aa","ab"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] cnt = new int[26];

        for (int i = 0; i < magazine.length(); i++)
            cnt[magazine.charAt(i) - 97]++;

        for (int i = 0; i < ransomNote.length(); i++)

            if (--cnt[ransomNote.charAt(i) - 97] < 0)
                return false;

        return true;

    }
}
