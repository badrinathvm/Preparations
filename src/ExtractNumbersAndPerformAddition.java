/**
 * Created by Badri on 9/13/17.
 */
public class ExtractNumbersAndPerformAddition {

    public static void main(String[] args) {

       // ExtractNumbersAndPerformAddition.extractString("abc123def7");

        ExtractNumbersAndPerformAddition.enhancedSolution("abc123def7");

    }

    public static void extractString(String str){

        char arr[] = str.toCharArray();
        String data = "";
        int counter = 0;
        int add[] = new int[str.length()+1];
        //System.out.println(str.charAt(0));

        for (int i = 0; i<arr.length;i++){
            if(arr[i] >= '0' && arr[i] <= '9' ){
                data += arr[i];
            }else if (!(arr[i+1] >= '0' && arr[i+1] <= '9')){
                if(data.length() >= 1){
                    add[counter] = Integer.parseInt(data);
                    counter ++;
                    data = "";
                }
            }
        }

        add[counter] = Integer.parseInt(data);
        data = "";

            for (int i : add){
                if(i != 0) {
                    System.out.println(i);
                }
            }

    }

    public static void enhancedSolution(String str){


        char c[] = str.toCharArray();
        int counter = 0;
        String result = "";

        int add[] = new int[10];

        for ( int i =0; i<str.length(); i++){

            if(c[i] >= '0' && c[i] <= '9'){
                result += c[i];
            }else{
                if(result.length() > 1){
                    add[counter] = Integer.parseInt(result);
                    counter++;
                    result = "";
                }
            }

        }

        add[counter] = Integer.parseInt(result);
        counter++;
        result = "";


        for (int i : add){
            if(i!= 0){
                System.out.println(i);
            }
        }
    }


}
