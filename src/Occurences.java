/**
 * Created by Badri on 7/18/17.
 */
public class Occurences {

    public static void main(String[] args) {
        String inputString = "knowbutuknow";
        String subString = "know";

        int matches = 0;
        for (int outer = 0; outer <= inputString.length() - subString.length(); outer++){
            for (int inner = 0; inner < subString.length(); inner++){
                if (inputString.charAt(outer + inner) == subString.charAt(inner)){
                    // letter matched, proceed.
                    if (inner == subString.length()-1){
                        //last letter matched, so a word match at position "outer"
                        matches++;
                        //proceed with outer. Room for improvement: Skip next n chars beeing
                        // part of the match already.
                        //System.out.printf("Success");
                        break;
                    }
                }else{
                    //no match for "outer" position, proceed to next char.
                    break;
                }
            }
        }

        System.out.printf("Matches count" + matches);
    }
}
