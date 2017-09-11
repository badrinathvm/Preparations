import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Badri on 8/3/17.
 */
public class MultiplyStrings {


    public static void main(String[] args) {
        //System.out.println(MultiplyStrings.multiply("12","13"));
        System.out.println(MultiplyStrings.addStrings("92","12"));
    }


    public static String multiply(String num1, String num2) {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int[] d = new int[num1.length()+ num2.length()];

        //multiply each digit and sum at the corresponding positions
        for(int i=0; i<n1.length(); i++){
            for(int j=0; j<n2.length(); j++){
                d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
            }
        }

        StringBuilder sb = new StringBuilder();

        //calculate each digit
        for(int i=0; i<d.length; i++){
            int mod = d[i]%10;
            int carry = d[i]/10;
            if(i+1<d.length){
                d[i+1] += carry;
            }
            sb.insert(0, mod);
        }

        //remove front 0's
        while(sb.charAt(0) == '0' && sb.length()> 1){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }


    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int carry = 0;
        for(int i = 0, j = 0; i < n1.length() || j < n2.length(); i++, j++){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int temp = (x + y + carry);
            sb.append(temp % 10);
            carry = temp / 10;
        }
        if(carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }


}
