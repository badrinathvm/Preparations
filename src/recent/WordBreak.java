package recent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Badri on 9/26/17.
 */
public class WordBreak {

    public static void main(String[] args) {


        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();

        wordDict.add("leet");
        wordDict.add("code");

        System.out.println(wordDict);

        System.out.println(WordBreak.wordBreak(s,wordDict));
    }


    public static boolean wordBreak(String s , List<String> wordDict){

        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;

        for ( int i=1;i<=s.length();i++){
            for ( int j=0 ; j<s.length(); j++){
                if( dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];


    }
}
