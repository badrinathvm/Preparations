/**
 * Created by Badri on 8/9/17.
 */
public class SplitArrayEqualToSum {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,5};
        int splitPoint = SplitArrayEqualToSum.splitPoint(num);

        if (splitPoint == 1){
            System.out.println("Split Not Possible");
        }

        for ( int i =0 ; i<num.length;i++){
            if(splitPoint == i){
                System.out.print("\n");
            }
            System.out.print(num[i]);
        }

    }

    public static int splitPoint(int num[]){

        int leftSum = 0;
        int rightsum = 0;

        for (int i =0;i<num.length;i++){
            leftSum += num[i];
        }

        for (int i = num.length-1;i>=0;i--){
            rightsum += num[i];

            leftSum -= num[i];

            if(leftSum == rightsum){
                return i;
            }
        }

        return -1;
    }
}
