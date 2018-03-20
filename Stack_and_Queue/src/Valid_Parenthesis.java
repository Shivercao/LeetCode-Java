import java.util.Stack;

/**
 * Created by shivercao on 3/11/2018.
 */
public class Valid_Parenthesis {
    public boolean isValid(String s){
        Stack<Character> checker = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char digit = s.charAt(i);
            if(digit == '(' || digit == '[' || digit == '{'){
                checker.push(s.charAt(i));
            }else if(digit == ')' && checker.peek() == '(' && !checker.empty()){
                checker.pop();
            }else if(digit == ']' && checker.peek() == '[' && !checker.empty()){
                checker.pop();
            }else if(digit == '}' && checker.peek() == '{' && !checker.empty()){
                checker.pop();
            }else{
                return false;
            }
        }return checker.empty();
    }

    public static void main(String[] args) {
        String sample = "()@@@{}@@@";
        String sample1 = "]";
        String sample2 = "(())[]";
        String sample3 = "([)][]";

        Valid_Parenthesis test = new Valid_Parenthesis();
        System.out.println(test.isValid(sample1));
        System.out.println(test.isValid(sample2));
        System.out.println(test.isValid(sample3));
    }
}
