/**
 * Created by Badri on 7/26/17.
 */
public class ShortestDistanceBetweenWords {

    public static void main(String[] args) {
        String w = "hello ho are you";
        System.out.println(ShortestDistanceBetweenWords.shortestDistance(w,"hello","you"));
    }


    public static int shortestDistance(String str, String a, String b) {
        int aIndex=-1;
        int bIndex=-1;
        int minDistance=Integer.MAX_VALUE;
        String[] aS=str.toLowerCase().split("[ \t]+");
        int i=0;
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
}
