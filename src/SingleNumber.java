import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by m785451 on 9/11/17.
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(SingleNumber.bitSingleNumber(new int[]{1, 1, 2, 3, 3, 4, 4, 4}));
    }

    public static int bitSingleNumber(int [] arr){


        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : arr) {
            if (!set.add(n))
                set.remove(n);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();

    }

    public static int singleNumber(int []arr){

        int result= 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i =0 ; i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            System.out.println( entry.getKey() + " --->"+ entry.getValue() );

            if(entry.getValue() == 1){
                result = entry.getKey();
            }
        }

        return result;

    }
}