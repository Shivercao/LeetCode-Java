/**
 * Created by shivercao on 3/20/2018.
 */
public class Fibonacci {
    final int Max = 1000;
    final int Min = -1;
    int[] look = new int[Max];

    void initialized(){
        for(int i = 0; i < Max; i++ ){
            look[i] = Min;
        }
    }
    private int fib_Memo(int n){
        if(look[n] == Min){
            if(n <= 1) return n;
            else{
                look[n] = fib_Memo(n-1) + fib_Memo(n-2);
            }
        }
        return look[n];
    }
}
