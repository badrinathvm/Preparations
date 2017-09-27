package recent;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Badri on 9/27/17.
 */
public class SortMap {


    public static void main(String[] args) {

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println(unsortMap);

        //sort based on keys

        Map<String,Integer> keySortMap = unsortMap
                                    .entrySet()
                                    .stream()
                                    .sorted(Map.Entry.comparingByKey())
                                    .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                                            (oldValue,newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(keySortMap);


        Map<String,Integer> valueSortMapDescending = unsortMap
                                            .entrySet()
                                            .stream()
                                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                                    (oldValue,newValue) -> oldValue,LinkedHashMap::new));

        System.out.println(valueSortMapDescending);



        Map<String,Integer> valueSortAscending = unsortMap
                                                .entrySet()
                                                .stream()
                                                .sorted(Map.Entry.comparingByValue())
                                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                                        (oldValue,newValue) -> oldValue ,LinkedHashMap::new));

        System.out.println(valueSortAscending);

//        for ( Map.Entry<String,Integer> mapData : valueSortMapDescending.entrySet()){
//            System.out.println(mapData.getKey() + "===>" + mapData.getValue());
//        }

    }




}
