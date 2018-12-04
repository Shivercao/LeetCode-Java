/**
 * Created by shivercao on 3/22/2018.
 */
public class Longest_Palindrome_Substr {
    StringBuilder longest = new StringBuilder();

    public String long_palin(String s){
        if(s.length() <= 1) return s;
        int num = s.length();

        // All substrings of length 1 are palindromes
        int maxlength = 1;
        for(int i = 0; i < num; ++i){
            if(s.charAt(i-1) == s.charAt(i+1)){

            }
        }

        return longest.toString();
    }
}
