/**
 * Created by Badri on 9/12/17.
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(StringCompression.compress("a"));

        String s = "LeeteCode";
        s= s.replaceAll("[e]{2,}","");
        System.out.println(s);

    }

    public static String compress(String str){
        String out = "";
        int sum =1;
        for ( int i =0 ; i<str.length()-1;i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                sum++;
            } else {
                out = out + str.charAt(i) + sum;
                sum = 1;
            }
        }

        out = out + str.charAt(str.length()-1) + sum;

        return out;
    }
}
