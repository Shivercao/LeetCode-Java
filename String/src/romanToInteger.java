import java.util.HashMap;

/**
 * Created by shivercao on 3/6/2018.
 * Roman to Decimal converters
 */
public class romanToInteger {
    public static int solution(String s){
        if(s == null || s.length() == 0) return 0;
        /*Roman Numbers:
        SYMBOL       VALUE
        I             1
        IV            4
        V             5
        IX            9
        X             10
        XL            40
        L             50
        XC            90
        C             100
        CD            400
        D             500
        CM            900
        M             1000
                 */
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int digit1 = value(s.charAt(i));
            if(i+1 < s.length()){
                // if digit1 < digit2: IV = 5-1 = 4.
                int digit2 = value((s.charAt(i+1)));
                sum = digit1 >= digit2? sum + digit1 : sum - digit1;
            }else{
                // if digit1 is the last digit, add on
                sum += digit1;
            }
        }
        return sum;
    }

    //build roman number hashmap.
    private static int value(char s){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Object value = map.get(s);
        return (int)value;
    }

    public static void main(String[] args){
        String sample = "LIX";
        romanToInteger test = new romanToInteger();
        int result = test.solution(sample);
        System.out.println(result);

    }
}
