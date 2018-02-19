import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shivercao on 1/25/2018.
 * Delete the duplicate in the array
 */
public class deleteDuplicate {
    public Integer dD(int[] sortedArray){
        if (sortedArray.length == 0 || sortedArray == null)return null;

        // for a sorted array: [1,1,3,4,5,5,6,7,7,7,8]
        //A[i] = A[i+1] delete;
        //delete:
        int index = 0;
        for (int i=1; i< sortedArray.length; i++){
            if(sortedArray[i-1]==sortedArray[i]){
                // update the arraylist.
                sortedArray[i-1] = 0;
            }
        }
        for(int i: sortedArray){
            if (i != 0){
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        deleteDuplicate solution = new deleteDuplicate();

        //for a sorted array - add to sortedArray
        int[] array = new int[]{1,1,3,4,5,5,6,7,7,7,8};

        //delete duplicate
        int answer = solution.dD(array);
        System.out.println(answer);
    }
}

