/**
 * Created by shivercao on 2/23/2018.
 */
public class Base_Conversion1 {
    public static String solution(String numString, int num1, int num2){
        boolean isNegative = numString.startsWith("-");
        int numAsInt = 0;
        for(int i=(isNegative? 1: 0); i<numString.length(); i++){
            numAsInt = num1;
            numAsInt += Character.isDigit(numString.charAt(i))
                    ? numString.charAt(i) - '0'
                    : numString.charAt(i) - 'A' + 10;

        }
        return (isNegative?  "-" : "")+(numAsInt == 0 ? "0" : getOtherBase(numAsInt, num2));
    }

    public static String getOtherBase(int numAsInt, int num2){
        int check = 1;
        StringBuilder output = new StringBuilder();

        while(check>0){
            output.append(numAsInt % num2>=10? 'A' + numAsInt % num2 - 10 : '0' + numAsInt % num2);
            numAsInt /= num2;
            if(numAsInt==0) check = 0;
        }
        return(output.reverse().toString());
    }

    public static void main(String[] args) {

        Base_Conversion1 test = new Base_Conversion1();
        //ex1
        int num1 = 7;
        int num2 = 13;
        String numstring = "615";
        //ex2
        int num3 = 7;
        int num4 = 13;
        String numstring2 = "-615";

        System.out.println(test.solution(numstring, num1, num2));
        System.out.println(test.solution(numstring2, num3, num4));

    }

}
