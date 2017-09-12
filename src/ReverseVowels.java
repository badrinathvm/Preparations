import java.util.ArrayList;

/**
 * Created by m785451 on 9/11/17.
 */
public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(ReverseVowels.reverseVowels("hello"));
    }

    public static String reverseVowels(String str){
        ArrayList<Character> vowList = new ArrayList<>();
        vowList.add('a');
        vowList.add('e');
        vowList.add('i');
        vowList.add('o');
        vowList.add('u');
        vowList.add('A');
        vowList.add('E');
        vowList.add('I');
        vowList.add('O');
        vowList.add('U');

        char arr[] = str.toCharArray();
        int i = 0;
        int j = str.length()-1;

        while (i<j){
            if(!vowList.contains(arr[i])){
                i++;
                continue;
            }

            if(!vowList.contains(arr[j])){
                j--;
                continue;
            }

            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;


        }

        return new String(arr);
    }
}
