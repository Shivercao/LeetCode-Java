/**
 * Created by shivercao on 2/7/2018.
 * input: [1 ,3, 4, 5], 3
 * output: [3, 1, 4]  - equal likely
 */
import java.util.Random;
import java.util.Arrays;


public class Sample_offine {
    public static int[] solution1(int[] A, int k){
        //cornor case
        if(A == null||A.length == 0) return null;
        if(k <= 0) return new int[0];
        //choose each element equal likely
        //1. copy the first K integers to a new array.
        //random swap the other numbers with the rest of elements in A
        int[] arr = new int[k];
        Random rand = new Random();
        for(int i=0; i<A.length; i++){
            int idx = rand.nextInt(k);
            int trans = 0;
            trans = A[i];
            A[i] = A[idx];
            A[idx] = trans;
        }
        //seize the first kth elements copy to subset.
        for(int i=0;i<k;i++){
            arr[i]=A[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sample = new int[]{1, 4, 2, 7, 5, 9, 6, 5,10};
        Sample_offine sol1 = new Sample_offine();
        int[] a = sol1.solution1(sample, 5);
        System.out.println(Arrays.toString(a));
    }
}