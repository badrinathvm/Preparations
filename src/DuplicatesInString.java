import com.sun.org.apache.bcel.internal.generic.DUP;

import java.util.HashMap;
import java.util.*;

/**
 * Created by Badri on 7/8/17.
 */
public class DuplicatesInString {

    public static void main(String[] args) {
        DuplicatesInString.printDuplicates("Jaaavaaaaa");
    }


    public static void printDuplicates(String s){

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for( int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        Set<Map.Entry<Character,Integer>> mapSet = map.entrySet();

        for(Map.Entry<Character,Integer> set : mapSet){
            System.out.println(set.getKey() + " ----" + set.getValue());
        }

    }
}
