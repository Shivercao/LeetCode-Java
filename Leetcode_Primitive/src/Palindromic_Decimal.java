/**
 * Created by shivercao on 1/19/2018.
 */
public class Palindromic_Decimal {
    public static boolean solution (int x) {
        if (x<0)return false;
        int numDigits = (int)(Math.floor(Math.log(x)))+1;
        int mask = (int)Math.pow(10, numDigits-1);

        for(int i=0; i<numDigits/2; i++){
            int least_num = x%10;
            int start_num = x/mask;

            if(least_num!=start_num)return false;
            else{
                x /= 10;
                x %= mask;
                numDigits -= 2;
                mask /= 100;// your code here
            }
        }return true;
    }

    public static void main(String args[]){
        int sample = 12421;
        Palindromic_Decimal sol = new Palindromic_Decimal();

    }
}
