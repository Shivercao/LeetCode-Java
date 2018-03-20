import java.util.Stack;

/**
 * Created by shivercao on 3/12/2018.
 */
public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    //push element into stack
    public void push(int x){
        if(x < min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    //pop element out
    public void pop(){
        stack.pop();
    }

    //get the top element
    public int top(){
        return stack.peek();
    }

    //get the minValue element
    public int getMin(){
        return min;
    }
}
