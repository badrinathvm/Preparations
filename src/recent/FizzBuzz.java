package recent;

/**
 * Created by Badri on 9/26/17.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz.fizzBuzz(100);
    }


    public static void fizzBuzz(int num){

        StringBuilder sb = new StringBuilder();

        for (int i =0; i<num;i++){
            sb.append(calculate(i));
        }

        System.out.println(sb.toString().trim());

    }


    public static String calculate(int i){

        if(i % 3 == 0) { return "\n Fizz"; }

        if(i%5 ==0 ) { return "\n Buzz"; }

        if(i%15 == 0) { return "\n FizzBuzz" ;}

        return "\n"+i;

    }
}
