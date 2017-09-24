package recent;

/**
 * Created by Badri on 9/23/17.
 */
public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(PalindromePermutation.palindromePermutation("dad","dda"));
        System.out.println(PalindromePermutation.isRotation("waterbottle","erbottlewat"));
    }


    public static boolean palindromePermutation(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int letters[] = new int[256];

        for (int i =0; i<s.length();i++){
            letters[s.charAt(i)]++;
        }

        for ( int i =0; i<t.length(); i++){
            letters[t.charAt(i)]--;

            if(letters[t.charAt(i)] < 0){
                return false;
            }
        }

        return true;

    }

    static boolean isRotation(String s1,String s2) {
        return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
    }
}
