import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Badri on 7/8/17.
 */
public class GroupingAnagrams {


    public static void main(String[] args) {

        System.out.println(GroupingAnagrams.getAnagramas(new String[] {"str","rts","aaa"}));
    }

    public static List<List<String>> getAnagramas(String str[]){

        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

        for(String s: str){
            char arr[] = new char[26];

            //Find the key

            for(int i =0;i< s.length(); i++){
                arr[s.charAt(i) -'a']++;
            }

            String ns= new String(arr);

            if(map.containsKey(ns)){
                map.get(ns).add(s);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(s);
                map.put(ns,al);
            }
        }

        result.addAll(map.values());
        return result;
    }
}
