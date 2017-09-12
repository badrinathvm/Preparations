import java.util.HashMap;

/**
 * Created by m785451 on 9/11/17.
 */
public class WordPattern {

    public static void main(String[] args) {
        System.out.println(WordPattern.wordPattern("abba","dog cat cat dog"));
        System.out.println(WordPattern.wordPattern("abba","dog cat cat cat"));
    }


    public static boolean wordPattern(String pattern, String str){
        HashMap<Character,String> map = new HashMap<>();

        String arr[] = str.split(" ");

        if(pattern.length() != arr.length){
            return false;
        }


        for (int i = 0 ;i<pattern.length(); i++){

            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String value = map.get(c);
                if(!value.equalsIgnoreCase(arr[i])){
                    return false;
                }

            }else if (map.containsValue(arr[i])){
                return false;
            }

            map.put(c,arr[i]);

        }


        return true;
    }
}
