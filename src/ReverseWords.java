/**
 * Created by Badri on 7/25/17.
 */
public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords.reverseWords("I hate Cofeee");
    }

    public static void reverseWords(String s){

        StringBuilder result = new StringBuilder();
        String sArr[] = s.split(" ");
        for(int i = sArr.length-1; i>=0; i--){
            result.append(sArr[i]).append(" ");
        }

        System.out.println(result);

    }
}
