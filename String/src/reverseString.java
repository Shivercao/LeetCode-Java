/**
 * Created by shivercao on 2/20/2018.
 */
public class reverseString {
    public String reverseWords(String string){
        if(string.length() == 0 || string == null){
            return string;
        }
        //TURN TO CHAR_ARRAY
        char[] chars = string.toCharArray();
        //reverse the entire string and turn it into CharArray.
        reverse(chars, 0, string.length()-1);

        //reverse each single word including the comma
        int start = 0;
        int end  = 0;
        while(start < string.length()){
            while(start < end || start < string.length() && chars[start] == ' '){
                start++;
            }
            while(end < string.length() && (end<=start|| chars[end] != ' ')){
                end++;
            }
            reverse(chars, start, end-1);
            String test = new String(chars);
            System.out.println(test);
        }
        String string1 = new String(chars);
        return string1;

    }

    //reverse function: reverse the order of words from start index to end index.
    private String reverseto(String s, int start, int end){
        StringBuilder newWords = new StringBuilder();
        while(end>=start){
            newWords.append(s.charAt(end--));
        }
        return newWords.toString();

    }
    private void reverse(char[] chars, int start, int end){
        char temp;
        // reverse the characters
        while(start<end){
            temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        };
    }

    public static void main(String[] args) {
        String samp1 = "Let me tell you, my friend ";
        reverseString test = new reverseString();
        String result = test.reverseWords(samp1);
        System.out.println(result);


    }
}
