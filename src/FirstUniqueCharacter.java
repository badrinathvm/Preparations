/**
 * Created by m785451 on 9/11/17.
 */
public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(FirstUniqueCharacter.firstUniqCharacter("leetcode"));
        System.out.println(FirstUniqueCharacter.firstUniqCharacter("loveleetcode"));
    }


    public static int firstUniqCharacter(String s){
        int [] cache = new int[26];

        for (char c: s.toCharArray()){
            cache[c-'a']++;
        }

        for (int i =0 ; i<s.length();i++){
            if(cache[s.charAt(i)-'a'] == 1)
                return i;
        }

        return -1;
    }
}
