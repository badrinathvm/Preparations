package recent;

/**
 * Created by Badri on 9/23/17.
 */
public class OneWay {

    public static void main(String[] args) {

        System.out.println(OneWay.oneWay("pale","ple")); //true

        System.out.println(OneWay.oneWay("pales","pale")); //true

        System.out.println(OneWay.oneWay("pale","bale"));  //true

        System.out.println(OneWay.oneWay("pale","abe")); //false

    }


    public static boolean oneWay(String s, String t){

        if(s.length() == t.length()){
            return onEditReplace(s,t);
        }else if(s.length() + 1 == t.length()){
            return onEditInsert(s,t);
        }else if(s.length() -1 == t.length()) {
            return onEditInsert(t, s);
        }

        return false;
    }


    public static boolean onEditReplace(String s, String t){

        boolean foundDifference = false;

        for (int i =0; i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                if(foundDifference){
                    return false;
                }
            }

            foundDifference = true;
        }

        return true;
    }

    public static boolean onEditInsert(String s, String t){
        int index1 = 0 , index2 =0;

        while( index1 < s.length() && index2 < t.length()){
            if(s.charAt(index1) != t.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else{
                index1++;
                index2++;
            }
        }

        return true;
    }
}
