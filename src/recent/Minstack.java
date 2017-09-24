package recent;

import java.util.Stack;

/**
 * Created by Badri on 9/23/17.
 */


/* if we keep track of min at each stage, we would be able to easily know the minimum.  */

public class Minstack extends Stack<Integer> {

    Stack<Integer> s2;

    public Minstack(){
        s2 = new Stack<Integer>();
    }

    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return s2.peek();
        }
    }

    public void push(int value){
        if(value <= min()){
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop(){

        int value = super.pop();

        if(value == min()){
            s2.pop();
        }

        return value;
    }

    public static void main(String[] args) {

        Minstack min = new Minstack();

        min.push(10);
        min.push(4);
        min.push(20);
        min.push(2);

        System.out.println(min.pop());
    }

}
