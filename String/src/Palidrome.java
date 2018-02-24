/**
 * Created by shivercao on 2/19/2018.
 */

public class Palidrome {
    public boolean isPalindro(String str){
        if(str.length()==0 || str == null){
            return true;
        }
        // i move forward and j move backward
        int i = 0;
        int j = str.length() - 1;
//        while(i<j){
//            //i and j both skip non-alphanumeric character
//            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
//                i++;
//            }
//            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
//                j++;
//            }
//            if (Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))){
//                return false;
//            }
//        }
        for(;i<j;){
            char first = str.charAt(i);
            char last = str.charAt(j);
            // i and j both skip non-alphanumeric character
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
                first = str.charAt(i);
            }
            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
                last = str.charAt(j);
            }
            if (Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "A man,a plan, a canal, Panama";
        Palidrome sample1 = new Palidrome();
        System.out.println(sample1.isPalindro(test));
    }
}
