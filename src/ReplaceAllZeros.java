import java.util.Arrays;

/**
 * Created by Badri on 7/9/17.
 */
public class ReplaceAllZeros {

    public static void main(String[] args) {

        int[][][] a = new int[5][][];

        ReplaceAllZeros.replaceAllZerosToBack(new int [] {14,0,5,0,3,0,2});
        ReplaceAllZeros.replaceAllZerosToFront(new int [] {14,0,5,0,3,0,2});
    }

    public static void replaceAllZerosToBack(int arr[]){

        int counter = 0;

        for ( int i = 0; i< arr.length; i++){
            if( arr[i] != 0 ){
                arr[counter] = arr[i];
                counter ++ ;
            }
        }

        while(counter < arr.length){
            arr[counter] = 0;
            counter ++;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void replaceAllZerosToFront(int arr[]){

        int counter = arr.length - 1;

        for ( int i = arr.length-1; i>= 0; i --){
            if( arr[i] != 0 ){
                arr[counter] = arr[i];
                counter -- ;
            }
        }

        while(counter >= 0){
            arr[counter] = 0;
            counter --;
        }

        System.out.println(Arrays.toString(arr));
    }

}
