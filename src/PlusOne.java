/**
 * Created by Badri on 9/9/17.
 */
public class PlusOne {


    public static void main(String[] args) {
        int digits[] =  {9,9};
        //System.out.println(PlusOne.plusOne(digits));
        for ( int i : PlusOne.plusOne(digits)){
            System.out.print(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length== 0) {
            int[] temp = {1};
            return temp;
        }

        int carry = 1;
        int i;
        for (i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                carry += digits[i];
                digits[i] = carry;
                break;
            }
        }

        if (i < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }

}


