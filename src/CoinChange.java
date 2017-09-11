/**
 * Created by Badri on 8/16/17.
 */


import java.util.*;

public class CoinChange {


    public int numberOfSolutions(int total, int coins[]){
        int temp[][] = new int[coins.length+1][total+1];
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= total ; j++) {
                if (coins[i - 1] > j) {
                    temp[i][j] = temp[i - 1][j];
                } else {
                    temp[i][j] = temp[i][j - coins[i - 1]] + temp[i - 1][j];
                }
            }


//                if(j>=coins[i]){
//                    temp[i][j] = temp[i-1][j]+ temp[i][j-coins[i]];
//                }else
//                    temp[i][j] = temp[i-1][j];
//                }



             /* if ( coins[i-1] > j){
                  temp[i][j] = Math.min(temp[i-1][j] ,1+temp[i][j-coins[i-1]]);
              }else{
                  temp[i][j] = temp[i-1][j];
              }*/

            //}
        }
        return temp[coins.length][total];
    }


    public void printCoinChangingSolution(int total,int coins[]){
        List<Integer> result = new ArrayList<>();
        printActualSolution(result, total, coins, 0);
    }

    private void printActualSolution(List<Integer> result,int total,int coins[],int pos){
        if(total == 0){
            for(int r : result){
                System.out.print(r + " ");
            }
            System.out.print("\n");
        }
        for(int i=pos; i < coins.length; i++){
            if(total >= coins[i]){
                result.add(coins[i]);
                printActualSolution(result,total-coins[i],coins,i);
                result.remove(result.size()-1);
            }
        }
    }


    public static void main(String args[]){
        CoinChange cc = new CoinChange();
        int total = 4;
        int coins[] = {1,2,3};
        System.out.println(cc.numberOfSolutions(total, coins));
        //System.out.println(cc.numberOfSolutionsOnSpace(total, coins));
        cc.printCoinChangingSolution(total, coins);
    }
}


