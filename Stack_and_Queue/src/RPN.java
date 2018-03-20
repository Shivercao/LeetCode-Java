import com.sun.deploy.util.StringUtils;

import java.util.Stack;

/**
 * Created by shivercao on 3/10/2018.
 Example:
 Input: "3,4,+,2,*,1,+"
 Output: 15
 Explanation: First, we have 3, 4 and +, then we get 3 + 4 = 7;
 */
public class RPN {
    public static int eval(String RPNexpression){
        Stack<String> S = new Stack<String>();
        String[] splited = RPNexpression.split(",");
        int sum = 0;
        for(String a : splited){
            int num1, num2;
            switch (a){
                case "+" :
                    num1 = Integer.parseInt(S.pop());
                    num2 = Integer.parseInt(S.pop());
                    S.push(String.valueOf(num1 + num2));
                    break;
                case "-" :
                    num1 = Integer.parseInt(S.pop());
                    num2 = Integer.parseInt(S.pop());
                    S.push(String.valueOf(num2 - num1));
                    break;
                case "*" :
                    num1 = Integer.parseInt(S.pop());
                    num2 = Integer.parseInt(S.pop());
                    S.push(String.valueOf(num1 * num2));
                    break;
                case "/" :
                    num1 = Integer.parseInt(S.pop());
                    num2 = Integer.parseInt(S.pop());
                    S.push(String.valueOf(num2 / num1));
                    break;
                default: S.push(a); break;
            }
        }
        return Integer.parseInt(S.pop());
    }

    public static void main(String[] args) {
        String sample = "3,4,+,2,*,1,+";
        RPN test = new RPN();
        System.out.println(test.eval(sample));
    }
}
