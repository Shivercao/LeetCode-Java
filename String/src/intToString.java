import com.sun.deploy.util.StringUtils;

/**
 * Created by shivercao on 2/25/2018.
 */
public class intToString {
    public static String solution (int x){
        return String.valueOf(x);
    }
    public static Integer solution2 (String str){
        return isNumeric(str)? Integer.parseInt(str) : null;
    }
    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {
        int test = 317;
        String s1 = "312a";
        intToString sample = new intToString();
        System.out.println(sample.solution(test));
        System.out.println(sample.solution2(s1));
    }
}
