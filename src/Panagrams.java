/**
 * Created by Badri on 9/9/17.
 */
public class Panagrams {

    public static void main(String[] args) {
        Panagrams.panagrams("The quick brown fox jumps over a lazy dog.");
    }


    public static void panagrams(String s){

        String str = s.toLowerCase();
        int flag = 0;

        for ( int i =0 ; i<26; i++){
            flag = 0;
             for (int j =0; j<str.length();j++){
                 if(str.charAt(j) == 97+i){
                     flag =1;
                     break;
                 }
             }

             if(flag ==0){
                 break;
             }
        }

        System.out.println((flag==1)?"pangram":"not pangram");
    }
}
