/**
 * Created by shivercao on 2/22/2018.
 */
/*
Write a program that performs base conversion.
The input is a string, an integer b1, and another integer b2. The string represents an integer in base b1.
The output should be the string representing the integer in base b2.
Assume 2<=b1, b2<=16. Use "A" to represent 10, "B" for 11, ..., and "F" for 15.
Example:Input: "615", 7, 13
Output: "1A7"
Explanation: 6*7^2+1*7+5 = 1*13^2+ 10*13 + 7
*/

public class Base_Conversion {
    private static String solution(String numstring, int num1, int num2){
        if(numstring == null || numstring.length() == 0){
            return null;
        }
        int digit_new = 0;
        String output = "";
        int check = 0;
        boolean negative = false;
        //convert to decimal value
        int number_value = Dec_conver(numstring, num1);
        if(number_value<0) negative = true;

        //converted to the second base
        while(check==0){
            digit_new = Math.abs(number_value % num2);
            number_value /= num2;
            if(digit_new == 10){
                output = "A" + output;
            }else if(digit_new==11){
                output = "B" + output;
            }else if(digit_new==12){
                output = "C" + output;
            }else if(digit_new==13){
                output = "D" + output;
            }else if(digit_new==14){
                output = "E" + output;
            }else if(digit_new==15){
                output = "F" + output;
            }else{
                output = String.valueOf(digit_new)+ output;
            }
            if(number_value==0)check = 1;
        }
        //if the given number is negative
        if(negative){
            output = "-"+output;
        }
        return output;
    }

    public static Integer Dec_conver(String str, int num1){
        Integer number = Integer.parseInt(str);
        int check = 1;
        int number_value = 0;
        int exp = 0;
        int digit;
        // calculate the value on the 1st base
        while(check==1){
            digit = number % 10;
            number /= 10;
            number_value += digit * Math.pow(num1, exp);
            exp++;
            if(number == 0) check = 0;
        }
        return number_value;
    }

    public static void main(String[] args) {

        Base_Conversion test = new Base_Conversion();
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
