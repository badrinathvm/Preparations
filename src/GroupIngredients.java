/**
 * Created by Badri on 7/29/17.
 *
 *
 */

import java.util.*;

public class GroupIngredients {

    public static void main(String[] args) {
        Map<String, String[]> dataMap = new HashMap<String,String[]>();

        dataMap.put("Pasta",new String[] {"Cheese","Onions"});
        dataMap.put("Masala Rice",new String[] {"Chillies","Onions"});
        dataMap.put("Pizza",new String[] {"Green Peppers"});

        GroupIngredients.printDishesWithCommonIngredients(dataMap);
    }

    static void printDishesWithCommonIngredients(Map<String, String[]> dishIngredientsMap)
    {
        Map<String, Set<String>> invertedMap = new HashMap<String, Set<String>>();
        for (String dish : dishIngredientsMap.keySet())
        {
            String[] ingredients = dishIngredientsMap.get(dish);
            for (String ing : ingredients)
            {
                if (invertedMap.containsKey(ing))
                {
                    invertedMap.get(ing).add(dish);
                }
                else
                {
                    Set<String> dishSet = new HashSet<String>();
                    dishSet.add(dish);
                    invertedMap.put(ing, dishSet);
                }
            }
        }

        for (Set<String> dishes : invertedMap.values())
        {
            if (dishes.size() > 1)
                System.out.println(Arrays.toString(dishes.toArray()));
        }
    }
}
