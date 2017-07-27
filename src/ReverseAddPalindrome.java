/**
 * Created by Badri on 7/10/17.
 */
public class ReverseAddPalindrome {

    public static void main(String[] args) {
        ReverseAddPalindrome.reversAdd(7325);
    }

     public static int reverseNum(int n){

        int rev=0,rem = 0 ;
        while (n!= 0){
            rem = n%10;
            rev = rev * 10 + rem;
            n= n/10;
        }
        return rev;
     }


     static boolean checkPalindrome(int number){
         if(ReverseAddPalindrome.reverseNum(number) == number){
             return true;
         }else{
             return false;
         }
     }

     static void reversAdd(int number){
         if(checkPalindrome(number)){
             System.out.println("Give number is already palindrome");
         }else{
             while(!checkPalindrome(number)){
                 int rev = reverseNum(number);
                 int sum = number + rev;
                 System.out.println(number+" + "+rev+" = "+sum);
                 number = sum ;
             }
         }
     }
}
