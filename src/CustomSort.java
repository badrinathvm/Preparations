import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by m785451 on 9/15/17.
 */
public class CustomSort {

    public static void main(String[] args) {
        int arr[] = {3,1,2,2,4};

        //int arr[] = {8,5,5,5,5,1,1,1,4,4};

        CustomSort.customSort(arr);
    }

    static void customSort(int [] arr){

//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for ( int i = 0; i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else{
//                map.put(arr[i],1);
//            }
//        }
//
//        //System.out.println(map);
//        int counter = 0;
//        for(Map.Entry<Integer,Integer> dataSet : map.entrySet()){
//
////           if(dataSet.getValue() == 1) {
////               arr[counter] = dataSet.getKey();
////               counter++;
////           }else{
//               for (int i = 0; i< dataSet.getValue(); i++){
//                   //System.out.println(dataSet.getKey());
//                   if(dataSet.getValue() == 1){
//                       arr[counter] = dataSet.getKey();
//                       counter++;
//                   }
//
//               }
//           //}
//
//        }
//
//        for (int i : arr){
//            System.out.println(i);
//        }


        //int[] ar = new int[] {3,1,2,2,4};

        Map<Integer,Integer> numbers = new HashMap<>();

        for(int number : arr) {
            if(numbers.containsKey(number)) {
                Integer  count = numbers.get(number);
                numbers.put(number, ++count);
            } else {
                numbers.put(number,1);
            }
        }

        final class FrequencyComparator implements Comparator<Integer> {
            Map<Integer,Integer> refMap;
            public FrequencyComparator(Map<Integer,Integer> base) {
                this.refMap = base;
            }

            @Override
            public int compare(Integer k1, Integer k2) {
                Integer val1 = refMap.get(k1);
                Integer val2 = refMap.get(k2);

                int num = val1.compareTo(val2)  ;
                // if frequencies are same then compare number itself
                return  num == 0 ? k1.compareTo(k2)   : num;
            }
        }

        FrequencyComparator comp = new FrequencyComparator(numbers);
        TreeMap<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(comp);
        sortedMap.putAll(numbers);
        for(Integer i : sortedMap.keySet()) {
            int frequencey = sortedMap.get(i);
            for(int count  = 1 ; count <= frequencey ; count++) {
                System.out.print(i + " " );
            }
        }
    }

    }

