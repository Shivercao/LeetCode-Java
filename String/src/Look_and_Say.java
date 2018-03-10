/**
 * Created by shivercao on 3/10/2018.
 * <1, 11, 21, 1211, 111221, 312211>sequence
 */
public class Look_and_Say {
    public static String solution(int n){
        String res = "1";
        while (--n != 0) {
            res = nextNumber(res);
        }
        return res;
    }

    public static String nextNumber(String input){
        System.out.println(input);
        int count = 1;
        char digit = input.charAt(0);
        StringBuilder seq = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            //
            if(input.charAt(i) == input.charAt(i-1)){
                count++;
            }else{
                seq.append(count);
                seq.append(digit);
                digit = input.charAt(i);
                count = 1;
            }
        }
        seq.append(count);
        seq.append(digit);
        return seq.toString();
    }

    public static void main(String[] args) {
        int number = 7;
        Look_and_Say test = new Look_and_Say();
        System.out.println(test.solution(number));
    }
}
