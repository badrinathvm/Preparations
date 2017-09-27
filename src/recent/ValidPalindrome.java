package recent;

/**
 * Created by Badri on 9/23/17.
 */
public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        System.out.println(ValidPalindrome.validPalindrome(str));

    }

    public static boolean isAlphaNumeric(char c){

        if( (c >= '0' && c<= '9') || (c>='a' && c<='z') || (c>='A' && c<='Z')){
            return true;
        }

        return false;
    }

    public static boolean validPalindrome(String str){

        int left = 0;
        int right = str.length() - 1;

        while(left < right){

            if(!isAlphaNumeric(str.charAt(left))){
                left ++;
            }else if(!isAlphaNumeric(str.charAt(right))){
                right--;
            }else{
                if(Character.toLowerCase(str.charAt(left++)) != Character.toLowerCase(str.charAt(right--))){
                    return false;
                }
            }
        }

        return true;
    }




}
