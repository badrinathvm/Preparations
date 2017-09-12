/**
 * Created by m785451 on 9/11/17.
 */
public class UglyNumber {

    public static void main(String[] args) {

        System.out.println(UglyNumber.uglyNumber(6));
        System.out.println(UglyNumber.uglyNumber(8));
        System.out.println(UglyNumber.uglyNumber(14));

        UglyNumber.reverseString("hello");
    }


    public static void reverseString(String str){
        char s[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length-1 ; i>=0; i--){
            sb.append(s[i]);
        }

        System.out.println(sb.toString());
    }

    public static boolean uglyNumber(int num){

        if(num == 0){
            return false;
        }

        if(num == 1){
            return true;
        }

        if(num%2 == 0){
            num = num/2;
            return uglyNumber(num);
        }

        if(num%3 == 0){
            num = num/3;
            return uglyNumber(num);
        }

        if(num%5 == 0){
            num = num/5;
            return uglyNumber(num);
        }

        return false;
    }

}
