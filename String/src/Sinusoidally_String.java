/**
 * Created by shivercao on 3/5/2018.
 * Example:
 Input: "Hello World!"
 Output: "e lHloWrdlo!"
 Explanation: The two sorted input int array are merged into one sorted array.
 Hint: Try concrete examples, and look for periodicity.
 Note: We illustrate what it means to write a string in sinusoidal fashion by means of an example. The string "Hello.World!" written in sinusoidal fashion is  (Here _ denotes a blank.)
     e                      _                            l
 H        l          o             W             r              d
                 l                        o                              !
 Define the snakestring of s to be the left-right top-to-bottom sequence in which characters appear when s is written in sinusoidal fashion.
 For example, the snakestring string for "Hello World!" is "e lHloWrdlo!".
 */

public class Sinusoidally_String {
    public static String solution(String str){
        if(str == null || str.length() == 0){
            return str;
        }
        StringBuilder result = new StringBuilder();
        // index = 2 + 4n compose the first part.
        for(int i = 1; i < str.length(); i+=4) result.append(str.charAt(i));
        // index = even number -> next part.
        for(int j = 0; j < str.length(); j+=2) result.append(str.charAt(j));
        // index = 3 + 4n -> the third part.
        for(int k = 3; k < str.length(); k+=4) result.append(str.charAt(k));

        return result.toString();
    }

    public static void main(String[] args) {
        String sample = "Hello World";
        Sinusoidally_String test = new Sinusoidally_String();
        System.out.println(test.solution(sample));
    }
}
