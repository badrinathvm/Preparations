/**
 * Created by Badri on 7/26/17.
 */
public class ShortestDistanceBetweenWords {

    public static void main(String[] args) {
        String w = "practice makes perfect coding makes";
        //System.out.println(ShortestDistanceBetweenWords.shortestDistance(w,"makes","coding"));

        String words[] = {"practice", "makes", "perfect", "coding", "makes"};

        System.out.println(ShortestDistanceBetweenWords.shortestWordDistanceSame(words,"practice" ,"coding"));
    }


    public static int shortestDistance(String str, String a, String b) {
        int aIndex=-1;
        int bIndex=-1;
        int minDistance=Integer.MAX_VALUE;
        String[] aS=str.toLowerCase().split("[ \t]+");
        int i=0;

        boolean isSame;

        if(a.equals(b)){
            isSame = true;
        }

        for(String t:aS){

            if(t.equals(a)){
                aIndex=i;
            }
            if(t.equals(b)){
                bIndex=i;
            }
            if(aIndex!=-1 && bIndex!=-1){
                //minDistance= minDistance > Math.abs(bIndex-aIndex) ? bIndex-aIndex : minDistance;

                minDistance = Math.min(minDistance, Math.abs(bIndex-aIndex));
            }
            i++;
        }
        if(aIndex ==-1 || bIndex==-1)
            return -1;
        else
            return minDistance;
    }



    public static int shortestWordDistanceSame(String[] words, String word1, String word2) {

        if(words==null||words.length==0)
            return -1;

        if(word1==null || word2==null)
            return -1;

        boolean isSame = false;

        if(word1.equals(word2))
            isSame = true;

        int minDistance= Integer.MAX_VALUE;

        int prev=-1;
        int p1=-1;
        int p2=-1;

        for(int i=0; i<words.length; i++){
            if(isSame){
                if(words[i].equals(word1)){
                    if(prev!=-1){
                        minDistance=Math.min(minDistance, i-prev);
                    }
                    prev = i;
                }
            }else{
                if(word1.equals(words[i])){
                    p1=i;
                    if(p2!=-1){
                        minDistance = Math.min(minDistance, i-p2);
                    }
                }else if(word2.equals(words[i])){
                    p2=i;
                    if(p1!=-1){
                        minDistance = Math.min(minDistance, i-p1);
                    }
                }
            }
        }

        return minDistance;
    }


}
