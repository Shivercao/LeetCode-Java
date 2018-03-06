import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shivercao on 2/27/2018.
 */
//Example:
//        Input: "23"
//        Output: ["AD", "AE", "AF", "BD", "BE", "BF", "CD", "CE", "CF"]
//        Explanation: For digit 2, there is three corresponding characters, also the same for digit 3, then we have nine possible strings.
//        Hint: Use recursion.
//        Note: The cell phone keypad is specified by a mapping that takes a digit and returns the corresponding set of characters. The possible strings do not have to be legal words or phrases. Consider only uppercase letters.


public class PhoneNum {
    public static String solution(String phoneNumber){
        char[] partialMnemonics = new char[phoneNumber.length()];
//        List<String> Mnemonics = new ArrayList<>();
//        helper(phoneNumber, Mnemonics, 0, partialMnemonics);
        LinkedList<String> Mnemonics = new LinkedList<>();
        helper1(phoneNumber, Mnemonics);
        List<String> rec = new LinkedList<>();
        rec.addAll(Mnemonics);
        return Mnemonics.toString();
    }

    public static final char[][] phoneSetting = {{'0'},{'1'}, {'a','b','c'}, {'d','e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    //recursive method
    public static void helper(String phoneNumber, List<String> Mnemonics, int digit, char[] partialMnemonics){
        if(digit == phoneNumber.length()){
            Mnemonics.add(new String(partialMnemonics));
        }else{
            for(int i=0; i<phoneSetting[phoneNumber.charAt(digit)-'0'].length; ++i){
                int a = phoneNumber.charAt(digit)-'0';
                char c = phoneSetting[a][i];
                partialMnemonics[digit] = c;
                helper(phoneNumber, Mnemonics,digit+1, partialMnemonics);
            }
        }
    }

    //iterative method (unqualified)
    public static void helper1 (String phoneNumber, List<String> Mnemonics){
        Mnemonics.add(" ");
        for(int digit=0; digit<phoneNumber.length(); digit++){
            int a = phoneNumber.charAt(digit) - '0';
            int size = Mnemonics.size();
            for(int i = 0; i < size; i++){
                String temp = Mnemonics.get(size-1);
                Mnemonics.remove(size-1);
                for (int j = 0; j < phoneSetting[a].length; j++)
                    Mnemonics.add(temp + phoneSetting[a][j]);
            }
        }
    }

    public static void main(String[] args) {
        String a = "2498018";
        PhoneNum sample = new PhoneNum();
        String alpha = sample.solution(a);
        System.out.println(alpha);

    }
}
