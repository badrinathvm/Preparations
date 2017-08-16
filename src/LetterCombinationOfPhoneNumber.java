import java.util.ArrayList;
import java.util.List;

/**
 * Created by Badri on 8/14/17.
 */
public class LetterCombinationOfPhoneNumber {

    public static void main(String[] args) {
        System.out.println(LetterCombinationOfPhoneNumber.letterCombination("23"));
    }

    public static List<String> letterCombination(String digits){

        String s = "";
        ArrayList<String> result = new ArrayList<>();
        String phone[] = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if (digits.length() == 0) {
            return result;
        }
        helper(result,s,phone,digits);
        return result;
    }

    public static void helper(List<String> result ,String s,String[] phone ,String digits){

        if (digits.length() == 0){
            result.add(s);
            return;
        }

        //System.out.println();

        for (int i = 0 ; i < phone[digits.charAt(0)-'0'].length(); i++){
            s += phone[digits.charAt(0)-'0'].charAt(i);
            System.out.println(s);
            helper(result,s,phone,digits.substring(1));
            s = s.substring(0,s.length()-1);
        }

    }
}
