import java.util.Arrays;

/**
 * Created by shivercao on 2/6/2018.
 */

//Input: [1,2,9]
//Output: [1,3,0]

public class Increment_integer {

    private static int[] solution1 (int[] A) {
        // your code here
        if(A.length  == 0) return A;

        //classic addition
        int sum = 1;
        int zero = 0;
        for(int i = A.length-1; i>=0; i--){
            A[i] += sum;
            sum = A[i] / 10;
            A[i] = A[i] % 10;
            //corner case: ex. 99 -> 100;
            if(A[i] == 0)zero++;
        }

        if(zero == A.length){
            int[] result= new int[A.length+1];
            result[0] = 1;
            return result;
        }
        else{
            return A;
        }
    }

    public static void main(String[] args) {
        Increment_integer sol1 = new Increment_integer();
        int[] a1 = new int[]{1, 2, 4, 9};
        int[] a2 = new int[]{};
        int[] a3 = new int[]{1, 2};

        int[] t1 = sol1.solution1(a1);
        int[] t2 = sol1.solution1(a2);
        int[] t3 = sol1.solution1(a3);
        System.out.println("{1, 2, 4, 9} + 1 -> "+Arrays.toString(t1));
        System.out.println("{9, 9} + 1 -> "+Arrays.toString(t2));
        System.out.println("{1, 2} + 1 -> "+ Arrays.toString(t3));
    }
}