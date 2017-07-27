/**
 * Created by Badri on 7/10/17.
 */
public class ReverseString {

    public static void main(String[] args) {
        ReverseString.reverse("Java");
    }

    public static void reverse(String s){
        char arr[] = s.toCharArray();

        for( int i = arr.length - 1 ; i >= 0 ; --i){
            System.out.print(arr[i]);
        }
    }
}
