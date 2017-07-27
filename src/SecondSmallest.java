/**
 * Created by Badri on 7/9/17.
 */
public class SecondSmallest {

    public static void main(String[] args) {
        SecondSmallest.secondSmallest(new int[]{5,10,1,12,3});
    }

    public static void secondSmallest(int arr[]){

        int first,second;

        first = second = Integer.MAX_VALUE;
        if(arr.length < 2){
            System.out.println("Invalid Input");
            return;
        }

        for(int i = 0; i< arr.length; i++){

            /* If current element is smaller than first
              then update both first and second */

            if(arr[i]<first){
                second = first;
                first = arr[i];

            }

            /* If arr[i] is in between first and second
               then update second  */
            else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        if( second == Integer.MAX_VALUE){
            System.out.println("No Second smallest element");
        }else{
            System.out.println("First Smallest is " + first + " And second smallest is " + second);
        }
    }
}
